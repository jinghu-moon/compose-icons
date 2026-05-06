package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.AlignTop: ImageVector
    get() {
        if (_alignTop != null) return _alignTop!!
        _alignTop = phosphorBoldIcon(
            name = "AlignTop",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M228 40c0 6.627-5.373 12-12 12h-176C33.373 52 28 46.627 28 40 28 33.373 33.373 28 40 28h176c6.627 0 12 5.373 12 12ZM212 88v88c0 11.046-8.954 20-20 20h-36c-11.046 0-20-8.954-20-20v-88c0-11.046 8.954-20 20-20h36c11.046 0 20 8.954 20 20ZM188 92h-28v80h28ZM120 88v128c0 11.046-8.954 20-20 20h-36C52.954 236 44 227.046 44 216v-128C44 76.954 52.954 68 64 68h36c11.046 0 20 8.954 20 20ZM96 92h-28v120h28Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
        }
        return _alignTop!!
    }

private var _alignTop: ImageVector? = null
