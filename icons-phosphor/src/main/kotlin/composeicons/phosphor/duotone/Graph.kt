package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Graph: ImageVector
    get() {
        if (_graph != null) return _graph!!
        _graph = phosphorDuotoneIcon(
            name = "Graph",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M152 128c0 13.255-10.745 24-24 24-13.255 0-24-10.745-24-24 0-13.255 10.745-24 24-24 13.255 0 24 10.745 24 24Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.2f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
            addPath(
                pathData = parseSvgPathData("M200 152c-7.071-.004-13.942 2.346-19.53 6.68l-23.11-18c1.745-3.999 2.643-8.317 2.64-12.68 0-.74 0-1.48-.08-2.21l13.23-4.41c8.653 13.345 25.793 18.31 40.238 11.656 14.445-6.654 21.812-22.907 17.293-38.156C226.163 79.63 211.131 70.014 195.392 72.304 179.654 74.594 167.986 88.096 168 104c0 .74 0 1.48 .08 2.21l-13.23 4.41C148.957 101.51 138.85 96.006 128 96c-1.766 .004-3.528 .151-5.27 .44L115.89 81c12.195-9.744 15.58-26.865 8.011-40.517C116.331 26.831 100.016 20.633 85.292 25.815 70.567 30.997 61.73 46.047 64.379 61.431 67.028 76.814 80.39 88.042 96 88c1.766-.004 3.528-.151 5.27-.44l6.84 15.4c-11.962 9.468-15.553 26.076-8.57 39.64L73.83 165.44c-13.386-9.024-31.395-6.687-42.034 5.455-10.639 12.143-10.59 30.302 .115 42.387 10.705 12.085 28.726 14.324 42.063 5.227 13.337-9.097 17.83-26.692 10.486-41.069l25.71-22.84c11.417 7.687 26.477 7.188 37.36-1.24l23.11 18c-1.739 3.987-2.638 8.29-2.64 12.64 0 17.673 14.327 32 32 32 17.673 0 32-14.327 32-32 0-17.673-14.327-32-32-32ZM200 88c8.837 0 16 7.163 16 16 0 8.837-7.163 16-16 16-8.837 0-16-7.163-16-16 0-8.837 7.163-16 16-16ZM80 56C80 47.163 87.163 40 96 40c8.837 0 16 7.163 16 16 0 8.837-7.163 16-16 16C87.163 72 80 64.837 80 56ZM56 208c-8.837 0-16-7.163-16-16 0-8.837 7.163-16 16-16 8.837 0 16 7.163 16 16 0 8.837-7.163 16-16 16ZM112 128c0-8.837 7.163-16 16-16 8.837 0 16 7.163 16 16 0 8.837-7.163 16-16 16-8.837 0-16-7.163-16-16ZM200 200c-8.837 0-16-7.163-16-16 0-8.837 7.163-16 16-16 8.837 0 16 7.163 16 16 0 8.837-7.163 16-16 16Z"),
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
        return _graph!!
    }

private var _graph: ImageVector? = null
