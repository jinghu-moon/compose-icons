package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Password: ImageVector
    get() {
        if (_password != null) return _password!!
        _password = phosphorLightIcon(
            name = "Password",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M46 56v144c0 3.314-2.686 6-6 6-3.314 0-6-2.686-6-6v-144c0-3.314 2.686-6 6-6 3.314 0 6 2.686 6 6ZM140.58 112.41 118 119.74v-23.74c0-3.314-2.686-6-6-6-3.314 0-6 2.686-6 6v23.74L83.42 112.41c-2.051-.708-4.324-.254-5.946 1.187-1.621 1.442-2.338 3.646-1.875 5.766 .464 2.12 2.035 3.824 4.11 4.457l22.58 7.33-14 19.21c-1.317 1.73-1.595 4.037-.726 6.031 .868 1.993 2.747 3.361 4.911 3.575 2.164 .214 4.274-.76 5.515-2.545l14-19.21 14 19.21c1.977 2.597 5.666 3.137 8.305 1.217 2.639-1.92 3.258-5.598 1.395-8.277l-14-19.21 22.58-7.33c2.075-.633 3.647-2.337 4.11-4.457 .464-2.12-.253-4.324-1.875-5.766-1.621-1.442-3.895-1.896-5.946-1.187ZM244.14 116.26c-1.025-3.15-4.409-4.874-7.56-3.85L214 119.74v-23.74c0-3.314-2.686-6-6-6-3.314 0-6 2.686-6 6v23.74l-22.58-7.33c-2.051-.708-4.324-.254-5.946 1.187-1.621 1.442-2.338 3.646-1.875 5.766 .464 2.12 2.035 3.824 4.11 4.457l22.58 7.33-13.95 19.21c-1.317 1.73-1.595 4.037-.726 6.031 .868 1.993 2.747 3.361 4.911 3.575 2.164 .214 4.274-.76 5.515-2.545l14-19.21 14 19.21c1.977 2.597 5.666 3.137 8.305 1.217 2.639-1.92 3.258-5.598 1.395-8.277L217.79 131.15l22.58-7.33c3.118-1.058 4.801-4.432 3.77-7.56Z"),
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
        return _password!!
    }

private var _password: ImageVector? = null
