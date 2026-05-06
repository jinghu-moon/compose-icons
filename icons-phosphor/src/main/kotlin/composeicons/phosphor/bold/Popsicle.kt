package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Popsicle: ImageVector
    get() {
        if (_popsicle != null) return _popsicle!!
        _popsicle = phosphorBoldIcon(
            name = "Popsicle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 4C86.045 4.044 52.044 38.045 52 80v96c0 11.046 8.954 20 20 20h24v28c0 17.673 14.327 32 32 32 17.673 0 32-14.327 32-32v-28h24c11.046 0 20-8.954 20-20v-96C203.956 38.045 169.955 4.044 128 4ZM136 224c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-28h16ZM180 172h-104v-92C76 51.281 99.281 28 128 28c28.719 0 52 23.281 52 52ZM120 76v68c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12v-68c0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12ZM160 76v68c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12v-68c0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12Z"),
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
        return _popsicle!!
    }

private var _popsicle: ImageVector? = null
