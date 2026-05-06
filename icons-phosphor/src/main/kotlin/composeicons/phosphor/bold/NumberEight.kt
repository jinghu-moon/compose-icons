package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.NumberEight: ImageVector
    get() {
        if (_numberEight != null) return _numberEight!!
        _numberEight = phosphorBoldIcon(
            name = "NumberEight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M162.44 118.91c16.195-14.316 21.845-37.158 14.191-57.373C168.977 41.322 149.615 27.95 128 27.95c-21.615 0-40.977 13.372-48.631 33.587-7.654 20.215-2.004 43.057 14.191 57.373C72.122 133.938 62.902 161.131 70.782 186.098c7.879 24.967 31.037 41.943 57.218 41.943 26.181 0 49.339-16.976 57.218-41.943 7.879-24.967-1.34-52.161-22.778-67.188ZM100 80c0-15.464 12.536-28 28-28 15.464 0 28 12.536 28 28 0 15.464-12.536 28-28 28C112.536 108 100 95.464 100 80ZM128 204C108.118 204 92 187.882 92 168c0-19.882 16.118-36 36-36 19.882 0 36 16.118 36 36 0 19.882-16.118 36-36 36Z"),
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
        return _numberEight!!
    }

private var _numberEight: ImageVector? = null
