package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ChatsTeardrop: ImageVector
    get() {
        if (_chatsTeardrop != null) return _chatsTeardrop!!
        _chatsTeardrop = phosphorLightIcon(
            name = "ChatsTeardrop",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M168.16 74.42C154.016 39.956 117.476 20.304 80.924 27.504 44.373 34.704 18.016 66.746 18 104v64c0 7.732 6.268 14 14 14h56c12.143 29.04 40.524 47.96 72 48h64c7.732 0 14-6.268 14-14v-64c.004-39.922-30.137-73.404-69.84-77.58ZM30 168v-64C30 67.549 59.549 38 96 38c36.451 0 66 29.549 66 66 0 36.451-29.549 66-66 66h-64c-1.105 0-2-.895-2-2ZM226 216c0 1.105-.895 2-2 2h-64c-24.874-.028-47.628-14.011-58.89-36.19 22.705-1.477 43.629-12.805 57.279-31.008 13.65-18.203 18.663-41.463 13.721-63.672C203.347 92.961 225.995 120.223 226 152Z"),
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
        return _chatsTeardrop!!
    }

private var _chatsTeardrop: ImageVector? = null
