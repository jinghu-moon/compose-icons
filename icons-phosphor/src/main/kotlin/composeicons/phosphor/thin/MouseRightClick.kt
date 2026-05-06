package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.MouseRightClick: ImageVector
    get() {
        if (_mouseRightClick != null) return _mouseRightClick!!
        _mouseRightClick = phosphorThinIcon(
            name = "MouseRightClick",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M144 20h-32C78.879 20.039 52.039 46.879 52 80v96c.039 33.121 26.879 59.961 60 60h32c33.121-.039 59.961-26.879 60-60v-96C203.961 46.879 177.121 20.039 144 20ZM196 80v28h-42.34L194.41 67.25c1.06 4.167 1.594 8.45 1.59 12.75ZM191.49 58.85 142.34 108h-10.34v-26.34L175.22 38.44c7.055 5.325 12.651 12.345 16.27 20.41ZM168.3 34.05 132 70.34v-42.34h12c8.474-.009 16.82 2.069 24.3 6.05ZM112 28h12v80h-64v-28C60.033 51.295 83.295 28.033 112 28ZM144 228h-32C83.295 227.967 60.033 204.705 60 176v-60h136v60c-.033 28.705-23.295 51.967-52 52Z"),
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
        return _mouseRightClick!!
    }

private var _mouseRightClick: ImageVector? = null
