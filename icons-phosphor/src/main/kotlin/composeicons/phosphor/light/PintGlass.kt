package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.PintGlass: ImageVector
    get() {
        if (_pintGlass != null) return _pintGlass!!
        _pintGlass = phosphorLightIcon(
            name = "PintGlass",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M204.49 28C203.348 26.723 201.714 25.995 200 26h-144c-1.722-.012-3.367 .717-4.515 2C50.337 29.284 49.796 31 50 32.71L73.16 225.71c.866 7.035 6.852 12.313 13.94 12.29h81.8c7.086-0 13.055-5.295 13.9-12.33L206 32.71c.197-1.714-.353-3.43-1.51-4.71ZM193.24 38l-3.36 28h-123.76L62.76 38ZM170.89 224.24c-.122 1.01-.983 1.767-2 1.76h-81.79c-1.017 .007-1.878-.75-2-1.76L67.56 78h120.88Z"),
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
        return _pintGlass!!
    }

private var _pintGlass: ImageVector? = null
