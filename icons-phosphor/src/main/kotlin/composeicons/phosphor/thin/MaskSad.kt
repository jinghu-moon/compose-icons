package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.MaskSad: ImageVector
    get() {
        if (_maskSad != null) return _maskSad!!
        _maskSad = phosphorThinIcon(
            name = "MaskSad",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M155.33 186.21c-1.222 1.837-3.701 2.339-5.54 1.12C142.8 182.69 137 180 128 180c-9 0-14.8 2.69-21.79 7.33-1.189 .861-2.754 1.002-4.078 .367-1.324-.635-2.193-1.945-2.264-3.412-.071-1.467 .666-2.854 1.922-3.615C109.61 175.46 117.07 172 128 172c10.93 0 18.39 3.46 26.21 8.67 1.837 1.222 2.339 3.701 1.12 5.54ZM181 117.33c-3.4 3.8-10.72 6.67-17 6.67-6.28 0-13.62-2.87-17-6.67-1.472-1.657-4.008-1.807-5.665-.335-1.657 1.472-1.807 4.008-.335 5.665 4.92 5.5 14.37 9.34 23 9.34 8.63 0 18.06-3.84 23-9.33 1.475-1.657 1.327-4.195-.33-5.67-1.657-1.475-4.195-1.327-5.67 .33ZM220 48v55.78c0 35-9.4 68-26.48 92.92C176.13 222.05 152.86 236 128 236 103.14 236 79.87 222.05 62.48 196.71 45.4 171.83 36 138.83 36 103.79v-55.79c-.004-3.962 1.948-7.67 5.216-9.91 3.268-2.24 7.431-2.723 11.124-1.29C66.66 42.38 95.53 51.7 128 51.7c32.47 0 61.34-9.32 75.66-14.88 3.69-1.432 7.849-.951 11.116 1.284 3.267 2.235 5.221 5.938 5.224 9.896ZM212 48c.003-1.32-.646-2.556-1.734-3.304-1.088-.748-2.475-.911-3.706-.436C191.72 50 161.77 59.7 128 59.7 94.23 59.7 64.28 50 49.44 44.27 48.98 44.095 48.492 44.004 48 44c-.798-.002-1.577 .242-2.23 .7C44.67 45.439 44.007 46.675 44 48v55.77C44 172.28 81.68 228 128 228c46.32 0 84-55.72 84-124.21ZM115 122.66c1.475-1.657 1.327-4.195-.33-5.67-1.657-1.475-4.195-1.327-5.67 .33-3.4 3.8-10.72 6.67-17 6.67-6.28 0-13.62-2.87-17-6.67-1.472-1.657-4.008-1.807-5.665-.335-1.657 1.472-1.807 4.008-.335 5.665 4.92 5.5 14.37 9.34 23 9.34 8.63 0 18.06-3.83 23-9.32Z"),
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
        return _maskSad!!
    }

private var _maskSad: ImageVector? = null
