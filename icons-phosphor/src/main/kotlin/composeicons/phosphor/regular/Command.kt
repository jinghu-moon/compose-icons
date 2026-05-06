package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Command: ImageVector
    get() {
        if (_command != null) return _command!!
        _command = phosphorRegularIcon(
            name = "Command",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
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
