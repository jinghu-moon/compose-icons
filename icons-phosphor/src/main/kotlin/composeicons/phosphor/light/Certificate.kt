package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Certificate: ImageVector
    get() {
        if (_certificate != null) return _certificate!!
        _certificate = phosphorLightIcon(
            name = "Certificate",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M126 136c0 3.314-2.686 6-6 6h-48c-3.314 0-6-2.686-6-6 0-3.314 2.686-6 6-6h48c3.314 0 6 2.686 6 6ZM120 98h-48c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6h48c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6ZM230 160.62v63.38c.005 2.146-1.137 4.131-2.994 5.207-1.857 1.075-4.147 1.076-6.006 .003L196 214.91l-25 14.3c-1.859 1.073-4.149 1.072-6.006-.003C163.137 228.131 161.995 226.146 162 224v-26h-122c-7.732 0-14-6.268-14-14v-128C26 48.268 32.268 42 40 42h176c7.732 0 14 6.268 14 14v31.38c10.2 9.446 15.999 22.718 15.999 36.62 0 13.902-5.798 27.174-15.999 36.62ZM196 86c-20.987 0-38 17.013-38 38 0 20.987 17.013 38 38 38 20.987 0 38-17.013 38-38C234 103.013 216.987 86 196 86ZM162 186v-25.38C143.906 143.734 140.888 116.151 154.903 95.752 168.918 75.353 195.748 68.277 218 79.11v-23.11c0-1.105-.895-2-2-2h-176c-1.105 0-2 .895-2 2v128c0 1.105 .895 2 2 2ZM218 168.89c-13.875 6.814-30.125 6.814-44 0v44.77l19-10.87c1.856-1.072 4.144-1.072 6 0l19 10.87Z"),
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
        return _certificate!!
    }

private var _certificate: ImageVector? = null
