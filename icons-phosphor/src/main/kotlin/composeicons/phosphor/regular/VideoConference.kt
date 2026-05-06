package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.VideoConference: ImageVector
    get() {
        if (_videoConference != null) return _videoConference!!
        _videoConference = phosphorRegularIcon(
            name = "VideoConference",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216 40h-176C31.163 40 24 47.163 24 56v144c0 8.837 7.163 16 16 16h176c8.837 0 16-7.163 16-16v-144c0-8.837-7.163-16-16-16ZM216 120h-48v-64h48ZM40 56h112v144h-112ZM216 200h-48v-64h48v64ZM180 88c0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12ZM204 168c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12ZM135.75 166c-2.589-9.666-8.727-18-17.19-23.34 9.191-9.137 11.964-22.916 7.022-34.897C120.641 95.783 108.96 87.965 96 87.965c-12.96 0-24.641 7.817-29.582 19.798-4.942 11.981-2.169 25.76 7.022 34.897C64.983 148.006 58.846 156.338 56.25 166c-1.105 4.28 1.47 8.645 5.75 9.75 4.28 1.105 8.645-1.47 9.75-5.75C74.39 159.75 84.81 152 96 152c11.19 0 21.62 7.73 24.25 18 1.105 4.28 5.47 6.855 9.75 5.75 4.28-1.105 6.855-5.47 5.75-9.75ZM80 120c0-8.837 7.163-16 16-16 8.837 0 16 7.163 16 16 0 8.837-7.163 16-16 16-8.837 0-16-7.163-16-16Z"),
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
        return _videoConference!!
    }

private var _videoConference: ImageVector? = null
