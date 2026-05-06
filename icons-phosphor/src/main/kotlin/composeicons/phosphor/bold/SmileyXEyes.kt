package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.SmileyXEyes: ImageVector
    get() {
        if (_smileyXEyes != null) return _smileyXEyes!!
        _smileyXEyes = phosphorBoldIcon(
            name = "SmileyXEyes",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 20C68.353 20 20 68.353 20 128c0 59.647 48.353 108 108 108 59.647 0 108-48.353 108-108C235.934 68.381 187.619 20.066 128 20ZM128 212C81.608 212 44 174.392 44 128 44 81.608 81.608 44 128 44c46.392 0 84 37.608 84 84-.05 46.371-37.629 83.95-84 84ZM184.49 119.51c4.694 4.694 4.694 12.306 0 17-4.694 4.694-12.306 4.694-17 0L162 131l-5.51 5.52c-4.694 4.694-12.306 4.694-17 0-4.694-4.694-4.694-12.306 0-17L145 114l-5.52-5.51c-4.694-4.694-4.694-12.306 0-17 4.694-4.694 12.306-4.694 17 0L162 97l5.51-5.52c4.694-4.694 12.306-4.694 17 0 4.694 4.694 4.694 12.306 0 17L179 114ZM116.49 136.51c-2.252 2.259-5.31 3.529-8.5 3.529-3.19 0-6.248-1.27-8.5-3.529L94 131l-5.51 5.52c-4.694 4.694-12.306 4.694-17 0-4.694-4.694-4.694-12.306 0-17L77 114l-5.52-5.51c-4.694-4.694-4.694-12.306 0-17 4.694-4.694 12.306-4.694 17 0L94 97l5.51-5.52c4.694-4.694 12.306-4.694 17 0 4.694 4.694 4.694 12.306 0 17L111 114l5.52 5.51c2.249 2.255 3.51 5.311 3.504 8.496-.006 3.185-1.277 6.237-3.534 8.484ZM144 180c0 8.837-7.163 16-16 16-8.837 0-16-7.163-16-16 0-8.837 7.163-16 16-16 8.837 0 16 7.163 16 16Z"),
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
        return _smileyXEyes!!
    }

private var _smileyXEyes: ImageVector? = null
