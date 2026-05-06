package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.HandEye: ImageVector
    get() {
        if (_handEye != null) return _handEye!!
        _handEye = phosphorLightIcon(
            name = "HandEye",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M138 168c0 5.523-4.477 10-10 10-5.523 0-10-4.477-10-10 0-5.523 4.477-10 10-10 5.523 0 10 4.477 10 10ZM214 116v36c0 47.496-38.504 86-86 86C80.504 238 42 199.496 42 152v-76c.007-9.495 5.189-18.231 13.518-22.789C63.848 48.653 73.999 48.997 82 54.11v-10.11C81.999 30.712 92.017 19.562 105.229 18.145c13.212-1.416 25.366 7.358 28.181 20.345 7.965-5.4 18.262-5.959 26.764-1.453C168.677 41.543 173.996 50.377 174 60v34.11c8.001-5.113 18.152-5.457 26.482-.899 8.329 4.558 13.511 13.294 13.518 22.789ZM202 116c0-7.732-6.268-14-14-14-7.732 0-14 6.268-14 14v4c0 3.314-2.686 6-6 6-3.314 0-6-2.686-6-6v-60c0-7.732-6.268-14-14-14-7.732 0-14 6.268-14 14v44c0 3.314-2.686 6-6 6-3.314 0-6-2.686-6-6v-60c0-7.732-6.268-14-14-14-7.732 0-14 6.268-14 14v68c0 3.314-2.686 6-6 6-3.314 0-6-2.686-6-6v-36C82 68.268 75.732 62 68 62 60.268 62 54 68.268 54 76v76c0 40.869 33.131 74 74 74 40.869 0 74-33.131 74-74ZM181.37 165.32c.842 1.687 .842 3.673 0 5.36C180.65 172.12 163.3 206 128 206 92.7 206 75.35 172.12 74.63 170.68c-.842-1.687-.842-3.673 0-5.36C75.35 163.88 92.7 130 128 130c35.3 0 52.65 33.88 53.37 35.32ZM169.08 168C164.62 160.88 150.67 142 128 142c-22.67 0-36.65 18.85-41.08 26 4.46 7.13 18.41 26 41.08 26 22.67 0 36.65-18.85 41.08-26Z"),
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
        return _handEye!!
    }

private var _handEye: ImageVector? = null
