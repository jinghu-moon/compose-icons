package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.MicrophoneStage: ImageVector
    get() {
        if (_microphoneStage != null) return _microphoneStage!!
        _microphoneStage = phosphorThinIcon(
            name = "MicrophoneStage",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M168 20c-37.537 .044-67.956 30.463-68 68-.001 3.513 .273 7.02 .82 10.49L30.34 194.59c-3.526 4.77-3.015 11.406 1.2 15.58l14.29 14.3c4.179 4.207 10.811 4.714 15.58 1.19l96.11-70.48c25.255 3.958 50.596-6.582 65.594-27.283 14.998-20.701 17.12-48.064 5.491-70.83C216.977 34.302 193.563 19.982 168 20ZM228 88c.011 14.528-5.276 28.561-14.87 39.47L128.54 42.87c17.701-15.522 42.849-19.245 64.287-9.517C214.266 43.08 228.025 64.458 228 88ZM56.68 219.21c-1.594 1.17-3.804 1-5.2-.4L37.19 204.52c-1.4-1.396-1.57-3.606-.4-5.2l66.46-90.62c6.744 20.914 23.136 37.306 44.05 44.05ZM108 88c-.004-14.527 5.282-28.557 14.87-39.47l84.6 84.6c-17.716 15.474-42.84 19.168-64.26 9.449C121.789 132.861 108.023 111.522 108 88ZM106.83 149.17c1.558 1.561 1.558 4.089 0 5.65l-8 8c-.991 1.094-2.504 1.553-3.936 1.194-1.432-.359-2.55-1.477-2.908-2.908-.359-1.432 .101-2.945 1.194-3.936l8-8c.749-.752 1.766-1.176 2.828-1.178 1.062-.002 2.08 .418 2.832 1.168Z"),
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
