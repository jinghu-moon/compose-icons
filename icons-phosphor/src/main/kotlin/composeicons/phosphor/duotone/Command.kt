package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Command: ImageVector
    get() {
        if (_command != null) return _command!!
        _command = phosphorDuotoneIcon(
            name = "Command",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M208 76h0c0 15.464-12.536 28-28 28h-28v-28c0-15.464 12.536-28 28-28h0c15.464 0 28 12.536 28 28ZM76 48h0C60.536 48 48 60.536 48 76h0c0 15.464 12.536 28 28 28h28v-28C104 60.536 91.464 48 76 48ZM180 152h-28v28c0 15.464 12.536 28 28 28h0c15.464 0 28-12.536 28-28h0c0-15.464-12.536-28-28-28ZM48 180h0c0 15.464 12.536 28 28 28h0c15.464 0 28-12.536 28-28v-28h-28c-15.464 0-28 12.536-28 28Z"),
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
                pathData = parseSvgPathData("M180 144h-20v-32h20c19.882 0 36-16.118 36-36C216 56.118 199.882 40 180 40c-19.882 0-36 16.118-36 36v20h-32v-20C112 56.118 95.882 40 76 40 56.118 40 40 56.118 40 76c0 19.882 16.118 36 36 36h20v32h-20c-19.882 0-36 16.118-36 36 0 19.882 16.118 36 36 36 19.882 0 36-16.118 36-36v-20h32v20c0 19.882 16.118 36 36 36 19.882 0 36-16.118 36-36 0-19.882-16.118-36-36-36ZM160 76c0-11.046 8.954-20 20-20 11.046 0 20 8.954 20 20 0 11.046-8.954 20-20 20h-20ZM56 76C56 64.954 64.954 56 76 56c11.046 0 20 8.954 20 20v20h-20C64.954 96 56 87.046 56 76ZM96 180c0 11.046-8.954 20-20 20C64.954 200 56 191.046 56 180c0-11.046 8.954-20 20-20h20ZM112 112h32v32h-32ZM180 200c-11.046 0-20-8.954-20-20v-20h20c11.046 0 20 8.954 20 20 0 11.046-8.954 20-20 20Z"),
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
        return _command!!
    }

private var _command: ImageVector? = null
