package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Aperture: ImageVector
    get() {
        if (_aperture != null) return _aperture!!
        _aperture = phosphorBoldIcon(
            name = "Aperture",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M204.41 51.63C162.233 9.455 93.852 9.457 51.677 51.633 9.501 93.81 9.501 162.19 51.677 204.367c42.176 42.176 110.556 42.178 152.733 .003C224.819 184.198 236.304 156.696 236.304 128c0-28.696-11.486-56.198-31.894-76.37ZM187.41 68.63c3.227 3.211 6.186 6.679 8.85 10.37L169 111.09 145.7 45.88c15.816 3.374 30.313 11.266 41.73 22.72ZM68.56 68.63C82.26 54.86 100.336 46.302 119.67 44.43l14.16 39.65L65.71 71.61c.93-1.02 1.88-2.02 2.87-3.01ZM48 153.7C41.664 133.868 42.875 112.394 51.4 93.4L92.84 101ZM68.55 187.4C65.336 184.178 62.39 180.7 59.74 177L87 144.91l23.3 65.21C94.487 206.744 79.995 198.852 68.58 187.4ZM104.91 123.79l15.18-17.85 23.06 4.21 7.88 22.06-15.17 17.85-23.06-4.21ZM187.4 187.4c-13.703 13.766-31.777 22.324-51.11 24.2L122.15 172l68.14 12.44c-.93 .97-1.88 1.97-2.86 2.96ZM163.16 155 208 102.3c6.337 19.833 5.123 41.308-3.41 60.3Z"),
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
        return _aperture!!
    }

private var _aperture: ImageVector? = null
