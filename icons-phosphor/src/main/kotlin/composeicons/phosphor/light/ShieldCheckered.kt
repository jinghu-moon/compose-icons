package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ShieldCheckered: ImageVector
    get() {
        if (_shieldCheckered != null) return _shieldCheckered!!
        _shieldCheckered = phosphorLightIcon(
            name = "ShieldCheckered",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M208 42h-160C40.268 42 34 48.268 34 56v56c0 51.94 25.12 83.4 46.2 100.64 22.73 18.6 45.27 24.89 46.22 25.15 1.034 .282 2.126 .282 3.16 0 .95-.26 23.49-6.55 46.22-25.15C196.88 195.4 222 163.94 222 112v-56c0-7.732-6.268-14-14-14ZM210 56v56c0 3.39-.12 6.72-.34 10h-75.66v-68h74c1.105 0 2 .895 2 2ZM46 56c0-1.105 .895-2 2-2h74v68h-75.66C46.12 118.72 46 115.39 46 112ZM47.71 134h74.29v89.52C109.512 218.487 97.859 211.588 87.44 203.06 65.5 185 52.2 161.8 47.71 134ZM168.56 203.06c-10.419 8.528-22.072 15.427-34.56 20.46v-89.52h74.29c-4.49 27.8-17.79 51-39.73 69.06Z"),
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
        return _shieldCheckered!!
    }

private var _shieldCheckered: ImageVector? = null
