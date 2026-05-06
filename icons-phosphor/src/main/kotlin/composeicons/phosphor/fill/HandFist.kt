package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.HandFist: ImageVector
    get() {
        if (_handFist != null) return _handFist!!
        _handFist = phosphorFillIcon(
            name = "HandFist",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M232 120v8c0 27.647-11.008 54.156-30.592 73.67C181.825 221.185 155.277 232.098 127.63 232c-54-.19-98-42.06-103.12-94.78-.113-1.397 .513-2.751 1.651-3.569 1.138-.818 2.621-.982 3.909-.431 14.783 6.206 31.889 1.869 41.93-10.63 6.478 8.057 16.114 12.931 26.442 13.377 10.329 .446 20.349-3.579 27.498-11.047 3.238 5.261 7.642 9.709 12.87 13C126.952 146.992 119.998 161.07 120 176c-.008 2.243 .926 4.386 2.575 5.908 1.649 1.521 3.86 2.28 6.095 2.092 4.207-.453 7.38-4.029 7.33-8.26 .143-17.572 14.428-31.741 32-31.74 2.217 .005 4.336-.91 5.853-2.527 1.516-1.617 2.294-3.791 2.147-6.003-.371-4.265-3.969-7.523-8.25-7.47h-7.75c-13.255 0-24-10.745-24-24v-16h64c17.673 0 32 14.327 32 32ZM44.73 120C55.57 119.6 64 110.37 64 99.52v-23C64 65.63 55.57 56.4 44.73 56c-5.43-.198-10.706 1.821-14.616 5.593C26.203 65.366 23.996 70.567 24 76v24c-.004 5.433 2.203 10.634 6.114 14.407 3.91 3.772 9.187 5.792 14.616 5.593ZM100.73 120C111.57 119.61 120 110.38 120 99.53v-47C120 41.68 111.57 32.45 100.73 32.06c-5.419-.198-10.687 1.813-14.595 5.573C82.227 41.392 80.013 46.577 80 52v48c-.004 5.433 2.203 10.634 6.114 14.407 3.91 3.772 9.187 5.792 14.616 5.593ZM176 52c.004-5.433-2.203-10.634-6.114-14.407C165.976 33.821 160.7 31.802 155.27 32 144.43 32.4 136 41.63 136 52.48v19.52h36c2.209 0 4-1.791 4-4Z"),
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
        return _handFist!!
    }

private var _handFist: ImageVector? = null
