package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Log: ImageVector
    get() {
        if (_log != null) return _log!!
        _log = phosphorLightIcon(
            name = "Log",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M210 136c0 5.523-4.477 10-10 10-5.523 0-10-4.477-10-10 0-5.523 4.477-10 10-10 5.523 0 10 4.477 10 10ZM246 136c0 18.21-4.48 35.41-12.63 48.43C224.68 198.34 212.83 206 200 206h-144C43.17 206 31.32 198.34 22.63 184.43 14.48 171.41 10 154.21 10 136c0-18.21 4.48-35.41 12.63-48.43C31.32 73.66 43.17 66 56 66h37.52L131.76 27.76C132.884 26.634 134.409 26.001 136 26h32c3.314 0 6 2.686 6 6 0 3.314-2.686 6-6 6h-29.51L110.49 66h89.51c12.83 0 24.68 7.66 33.37 21.57C241.52 100.59 246 117.79 246 136ZM174 194c-2.795-2.922-5.275-6.13-7.4-9.57-3.533-5.761-6.302-11.956-8.24-18.43h-78.36c-3.314 0-6-2.686-6-6 0-3.314 2.686-6 6-6h75.52c-1.017-5.946-1.525-11.968-1.52-18 0-18.21 4.48-35.41 12.63-48.43C168.745 84.131 171.215 80.923 174 78h-118C42.11 78 29.84 93.1 24.64 114h79.36c3.314 0 6 2.686 6 6 0 3.314-2.686 6-6 6h-81.46c-.358 3.321-.538 6.659-.54 10 0 31.44 15.57 58 34 58ZM234 136C234 104.56 218.43 78 200 78c-18.43 0-34 26.56-34 58 0 31.44 15.57 58 34 58 18.43 0 34-26.56 34-58Z"),
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
        return _log!!
    }

private var _log: ImageVector? = null
