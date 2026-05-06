package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.GlobeSimpleX: ImageVector
    get() {
        if (_globeSimpleX != null) return _globeSimpleX!!
        _globeSimpleX = phosphorBoldIcon(
            name = "GlobeSimpleX",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M224.49 176.49 209 192l15.52 15.51c4.694 4.694 4.694 12.306 0 17-4.694 4.694-12.306 4.694-17 0L192 209l-15.51 15.52c-4.694 4.694-12.306 4.694-17 0-4.694-4.694-4.694-12.306 0-17L175 192 159.48 176.49c-4.694-4.694-4.694-12.306 0-17 4.694-4.694 12.306-4.694 17 0L192 175l15.51-15.52c4.694-4.694 12.306-4.694 17 0 4.694 4.694 4.694 12.306 0 17ZM236 128c0 6.627-5.373 12-12 12h-123.46c4.37 49.56 34.63 74.37 35 74.63h0c3.985 3.189 5.518 8.55 3.82 13.363-1.698 4.813-6.255 8.026-11.359 8.007C68.353 236 20 187.647 20 128 20 68.353 68.353 20 128 20c59.647 0 108 48.353 108 108ZM158.21 49.64c12.433 20.043 19.764 42.828 21.35 66.36h31.57C206.741 85.958 186.522 60.604 158.21 49.64ZM117.64 63.23C107.884 79.238 102.024 97.313 100.53 116h54.94c-3-33.9-18.09-56.22-27.45-67-3.843 4.452-7.314 9.211-10.38 14.23ZM44.87 116h31.57C78.026 92.468 85.357 69.683 97.79 49.64 69.478 60.604 49.259 85.958 44.87 116ZM76.44 140h-31.57c4.389 30.042 24.608 55.396 52.92 66.36C85.357 186.317 78.026 163.532 76.44 140Z"),
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
        return _globeSimpleX!!
    }

private var _globeSimpleX: ImageVector? = null
