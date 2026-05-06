package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ShareNetwork: ImageVector
    get() {
        if (_shareNetwork != null) return _shareNetwork!!
        _shareNetwork = phosphorBoldIcon(
            name = "ShareNetwork",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M176 156c-10.716-.017-21.066 3.897-29.09 11L106.1 140.8c2.533-8.345 2.533-17.255 0-25.6L146.91 89c16.425 14.435 40.976 14.555 57.542 .283 16.566-14.272 20.079-38.571 8.233-56.951C200.839 13.953 177.258 7.116 157.418 16.308c-19.84 9.192-29.87 31.602-23.508 52.522L93.09 95C75.408 79.374 48.547 80.478 32.207 97.503c-16.34 17.025-16.34 43.909 0 60.934 16.34 17.025 43.201 18.13 60.883 2.503l40.81 26.26c-5.523 18.164 1.227 37.821 16.743 48.761 15.516 10.939 36.299 10.693 51.552-.61 15.253-11.304 21.535-31.116 15.584-49.144C211.828 168.179 194.985 156.001 176 156ZM176 36c11.046 0 20 8.954 20 20 0 11.046-8.954 20-20 20C164.954 76 156 67.046 156 56c0-11.046 8.954-20 20-20ZM64 148C52.954 148 44 139.046 44 128c0-11.046 8.954-20 20-20 11.046 0 20 8.954 20 20 0 11.046-8.954 20-20 20ZM176 220c-11.046 0-20-8.954-20-20 0-11.046 8.954-20 20-20 11.046 0 20 8.954 20 20 0 11.046-8.954 20-20 20Z"),
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
        return _shareNetwork!!
    }

private var _shareNetwork: ImageVector? = null
