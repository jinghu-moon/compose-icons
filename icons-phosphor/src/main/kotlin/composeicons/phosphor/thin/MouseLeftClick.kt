package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.MouseLeftClick: ImageVector
    get() {
        if (_mouseLeftClick != null) return _mouseLeftClick!!
        _mouseLeftClick = phosphorThinIcon(
            name = "MouseLeftClick",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M144 20h-32C78.879 20.039 52.039 46.879 52 80v96c.039 33.121 26.879 59.961 60 60h32c33.121-.039 59.961-26.879 60-60v-96C203.961 46.879 177.121 20.039 144 20ZM196 80v28h-64v-80h12c28.705 .033 51.967 23.295 52 52ZM124 28v42.34L87.7 34.05C95.18 30.069 103.526 27.991 112 28ZM80.78 38.44 124 81.66v26.34h-10.34L64.51 58.85C68.129 50.785 73.725 43.765 80.78 38.44ZM60 80c-.004-4.3 .53-8.583 1.59-12.75L102.34 108h-42.34ZM144 228h-32C83.295 227.967 60.033 204.705 60 176v-60h136v60c-.033 28.705-23.295 51.967-52 52Z"),
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
        return _mouseLeftClick!!
    }

private var _mouseLeftClick: ImageVector? = null
