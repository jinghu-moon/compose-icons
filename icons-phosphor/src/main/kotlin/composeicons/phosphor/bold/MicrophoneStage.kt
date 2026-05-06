package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.MicrophoneStage: ImageVector
    get() {
        if (_microphoneStage != null) return _microphoneStage!!
        _microphoneStage = phosphorBoldIcon(
            name = "MicrophoneStage",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M168 12c-21.612-.023-42.208 9.169-56.624 25.269C96.959 53.37 90.09 74.852 92.49 96.33L23.91 189.85c-5.9 7.956-5.047 19.04 2 26l14.29 14.29c6.96 7.047 18.044 7.9 26 2l93.52-68.58c27.952 3.021 55.289-9.637 71.068-32.907 15.779-23.27 17.422-53.35 4.272-78.2C221.91 27.603 196.115 12.042 168 12ZM220 88c.01 9.635-2.674 19.081-7.75 27.27L140.74 43.75c16.039-9.874 36.163-10.303 52.608-1.121C209.793 51.81 219.988 69.166 220 88ZM54.72 210.71l-9.43-9.43 56.19-76.63c6.954 12.564 17.306 22.916 29.87 29.87ZM116 88c-.012-9.635 2.673-19.081 7.75-27.27l71.51 71.51c-16.037 9.873-36.159 10.303-52.604 1.124C126.212 124.185 116.015 106.833 116 88Z"),
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
        return _microphoneStage!!
    }

private var _microphoneStage: ImageVector? = null
