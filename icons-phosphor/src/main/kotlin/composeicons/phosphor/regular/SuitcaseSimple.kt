package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.SuitcaseSimple: ImageVector
    get() {
        if (_suitcaseSimple != null) return _suitcaseSimple!!
        _suitcaseSimple = phosphorRegularIcon(
            name = "SuitcaseSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216 56h-40v-8C176 34.745 165.255 24 152 24h-48C90.745 24 80 34.745 80 48v8h-40C31.163 56 24 63.163 24 72v128c0 8.837 7.163 16 16 16h176c8.837 0 16-7.163 16-16v-128c0-8.837-7.163-16-16-16ZM96 48c0-4.418 3.582-8 8-8h48c4.418 0 8 3.582 8 8v8h-64ZM216 72v72h-176v-72ZM216 200h-176v-40h176v40Z"),
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
        return _suitcaseSimple!!
    }

private var _suitcaseSimple: ImageVector? = null
