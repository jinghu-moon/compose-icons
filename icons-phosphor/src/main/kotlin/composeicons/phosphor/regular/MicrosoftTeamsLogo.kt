package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.MicrosoftTeamsLogo: ImageVector
    get() {
        if (_microsoftTeamsLogo != null) return _microsoftTeamsLogo!!
        _microsoftTeamsLogo = phosphorRegularIcon(
            name = "MicrosoftTeamsLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M112 104c0 4.418-3.582 8-8 8h-8v40c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-40h-8c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h32c4.418 0 8 3.582 8 8ZM232 92.74v59.26c-.004 20.782-15.922 38.099-36.63 39.85-9.736 24.215-33.2 40.093-59.299 40.126C109.972 232.009 86.467 216.19 76.67 192h-36.67c-8.837 0-16-7.163-16-16v-96C24 71.163 31.163 64 40 64h56.81C92.95 44.978 103.302 25.93 121.363 18.823c18.061-7.108 38.619-.224 48.757 16.327 12.652-6.081 27.789-3.206 37.331 7.089 9.542 10.295 11.261 25.607 4.239 37.761h7.57c7.032 .011 12.729 5.708 12.74 12.74ZM112 56c-.001 2.726 .466 5.432 1.38 8h22.62c6.779 .008 12.816 4.287 15.07 10.68 8.701-7.02 11.403-19.119 6.514-29.173C152.695 35.452 141.511 30.105 130.616 32.613 119.721 35.121 112.001 44.82 112 56ZM136 176h0v-96h-96v96h96ZM184 96h-32v80c0 8.837-7.163 16-16 16h-41.56c10.867 18.805 33.006 27.97 53.985 22.348C169.403 208.726 183.993 189.719 184 168ZM200 64c-.006-5.796-3.147-11.136-8.21-13.958-5.063-2.822-11.256-2.685-16.19 .358C177.096 60.884 174.362 71.533 168 80h16c8.837 0 16-7.163 16-16ZM216 96h-16v72c.001 2.255-.119 4.508-.36 6.75C209.414 171.468 215.999 162.31 216 152Z"),
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
        return _microsoftTeamsLogo!!
    }

private var _microsoftTeamsLogo: ImageVector? = null
