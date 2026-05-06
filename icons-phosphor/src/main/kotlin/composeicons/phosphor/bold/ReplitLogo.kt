package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ReplitLogo: ImageVector
    get() {
        if (_replitLogo != null) return _replitLogo!!
        _replitLogo = phosphorBoldIcon(
            name = "ReplitLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216 84h-60v-44C156 28.954 147.046 20 136 20h-64C60.954 20 52 28.954 52 40v48c0 11.046 8.954 20 20 20h60v40h-60c-11.046 0-20 8.954-20 20v48c0 11.046 8.954 20 20 20h64c11.046 0 20-8.954 20-20v-44h60c11.046 0 20-8.954 20-20v-48C236 92.954 227.046 84 216 84ZM132 212h-56v-40h56ZM132 84h-56v-40h56ZM212 148h-56v-40h56Z"),
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
        return _replitLogo!!
    }

private var _replitLogo: ImageVector? = null
