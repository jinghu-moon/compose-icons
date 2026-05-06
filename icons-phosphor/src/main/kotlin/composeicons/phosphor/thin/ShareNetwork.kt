package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ShareNetwork: ImageVector
    get() {
        if (_shareNetwork != null) return _shareNetwork!!
        _shareNetwork = phosphorThinIcon(
            name = "ShareNetwork",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M176 164c-10.834 .006-21.089 4.891-27.92 13.3L96.25 144c5.014-10.077 5.014-21.922 0-32L148.08 78.7c12.063 14.766 33.561 17.538 48.975 6.314 15.414-11.224 19.377-32.534 9.027-48.548C195.732 20.452 174.676 15.311 158.111 24.754 141.546 34.197 135.242 54.936 143.75 72L91.92 105.3C82.311 93.472 66.296 88.976 51.935 94.074 37.574 99.173 27.979 112.761 27.979 128c0 15.239 9.595 28.827 23.956 33.926 14.361 5.098 30.376 .602 39.985-11.226L143.75 184c-7.148 14.407-3.873 31.808 8.025 42.63 11.897 10.822 29.53 12.44 43.198 3.964 13.668-8.476 20.056-24.99 15.649-40.458C206.215 174.669 192.083 164 176 164ZM176 28c15.464 0 28 12.536 28 28 0 15.464-12.536 28-28 28C160.536 84 148 71.464 148 56c0-15.464 12.536-28 28-28ZM64 156C48.536 156 36 143.464 36 128c0-15.464 12.536-28 28-28 15.464 0 28 12.536 28 28 0 15.464-12.536 28-28 28ZM176 228c-15.464 0-28-12.536-28-28 0-15.464 12.536-28 28-28 15.464 0 28 12.536 28 28 0 15.464-12.536 28-28 28Z"),
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
