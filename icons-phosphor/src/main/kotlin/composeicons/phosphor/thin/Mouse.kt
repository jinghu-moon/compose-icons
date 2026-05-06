package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Mouse: ImageVector
    get() {
        if (_mouse != null) return _mouse!!
        _mouse = phosphorThinIcon(
            name = "Mouse",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M144 20h-32C78.879 20.039 52.039 46.879 52 80v96c.039 33.121 26.879 59.961 60 60h32c33.121-.039 59.961-26.879 60-60v-96C203.961 46.879 177.121 20.039 144 20ZM196 80v28h-64v-80h12c28.705 .033 51.967 23.295 52 52ZM112 28h12v80h-64v-28C60.033 51.295 83.295 28.033 112 28ZM144 228h-32C83.295 227.967 60.033 204.705 60 176v-60h136v60c-.033 28.705-23.295 51.967-52 52Z"),
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
        return _mouse!!
    }

private var _mouse: ImageVector? = null
