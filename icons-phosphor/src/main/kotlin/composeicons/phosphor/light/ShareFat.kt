package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ShareFat: ImageVector
    get() {
        if (_shareFat != null) return _shareFat!!
        _shareFat = phosphorLightIcon(
            name = "ShareFat",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M236.24 107.76l-80-80c-1.716-1.714-4.295-2.226-6.535-1.298-2.241 .928-3.702 3.113-3.705 5.538v42.2C91.52 77.79 25.61 129.2 18.07 194.86c-.502 4.288 1.805 8.415 5.721 10.233 3.916 1.818 8.557 .918 11.509-2.233h0C46.56 190.85 87 152.6 146 150.13v41.87c.002 2.425 1.464 4.611 3.705 5.538 2.241 .928 4.82 .415 6.535-1.298l80-80c2.34-2.343 2.34-6.137 0-8.48ZM158 177.52v-33.52c0-3.314-2.686-6-6-6-27.73 0-54.76 7.25-80.32 21.55-14.898 8.369-28.621 18.675-40.81 30.65 4.7-26.56 20.16-52 44-72.27C98.47 97.94 127.29 86 152 86c3.314 0 6-2.686 6-6v-33.51L223.51 112Z"),
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
        return _shareFat!!
    }

private var _shareFat: ImageVector? = null
