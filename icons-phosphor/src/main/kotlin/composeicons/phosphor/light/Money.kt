package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Money: ImageVector
    get() {
        if (_money != null) return _money!!
        _money = phosphorLightIcon(
            name = "Money",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 166c20.987 0 38-17.013 38-38C166 107.013 148.987 90 128 90c-20.987 0-38 17.013-38 38 0 20.987 17.013 38 38 38ZM128 102c14.359 0 26 11.641 26 26 0 14.359-11.641 26-26 26-14.359 0-26-11.641-26-26 0-14.359 11.641-26 26-26ZM240 58h-224c-3.314 0-6 2.686-6 6v128c0 3.314 2.686 6 6 6h224c3.314 0 6-2.686 6-6v-128c0-3.314-2.686-6-6-6ZM22 108.82C40.964 103.775 55.775 88.964 60.82 70h134.36c5.045 18.964 19.856 33.775 38.82 38.82v38.36c-18.964 5.045-33.775 19.856-38.82 38.82h-134.36C55.775 167.036 40.964 152.225 22 147.18ZM234 96.29C221.689 91.989 212.011 82.311 207.71 70h26.29ZM48.29 70C43.989 82.311 34.311 91.989 22 96.29v-26.29ZM22 159.71c12.311 4.301 21.989 13.979 26.29 26.29h-26.29ZM207.71 186c4.301-12.311 13.979-21.989 26.29-26.29v26.29Z"),
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
        return _money!!
    }

private var _money: ImageVector? = null
