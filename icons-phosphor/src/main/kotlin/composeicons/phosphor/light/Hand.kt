package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Hand: ImageVector
    get() {
        if (_hand != null) return _hand!!
        _hand = phosphorLightIcon(
            name = "Hand",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M188 50c-4.965-.006-9.826 1.421-14 4.11v-10.11C174.001 30.712 163.983 19.562 150.771 18.145c-13.212-1.416-25.366 7.358-28.181 20.345C114.625 33.09 104.328 32.531 95.826 37.037 87.323 41.543 82.004 50.377 82 60v71L74.47 118.9C67.326 106.443 51.437 102.136 38.98 109.28c-12.457 7.144-16.764 23.033-9.62 35.49C60.76 211 78.51 238 128 238c47.474-.055 85.945-38.526 86-86v-76C214 61.641 202.359 50 188 50ZM202 152c-.05 40.849-33.151 73.95-74 74-21 0-34.51-5.05-46.75-17.45C67.81 195 55.54 172 40.1 139.43L39.87 139c-3.866-6.696-1.571-15.259 5.125-19.125 6.696-3.866 15.259-1.571 19.125 5.125l.1 .17 18.68 30c1.413 2.28 4.168 3.345 6.748 2.609 2.579-.737 4.357-3.096 4.352-5.779v-92c0-7.732 6.268-14 14-14 7.732 0 14 6.268 14 14v60c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6v-76c0-7.732 6.268-14 14-14 7.732 0 14 6.268 14 14v76c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6v-44c0-7.732 6.268-14 14-14 7.732 0 14 6.268 14 14Z"),
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
        return _hand!!
    }

private var _hand: ImageVector? = null
