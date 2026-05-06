package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.SoccerBall: ImageVector
    get() {
        if (_soccerBall != null) return _soccerBall!!
        _soccerBall = phosphorFillIcon(
            name = "SoccerBall",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 24C70.562 24 24 70.562 24 128c0 57.438 46.562 104 104 104 57.438 0 104-46.562 104-104C231.939 70.588 185.412 24.061 128 24ZM136 63.38 160.79 46.33c14.193 5.717 26.66 15.021 36.18 27l-8 26.94c-.2 0-.41 .1-.61 .17l-22.82 7.41c-.342 .109-.677 .243-1 .4L136 88.62c0-.2 0-.41 0-.62v-24c0-.21 0-.42 0-.62ZM95.24 46.33 120 63.38c0 .2 0 .41 0 .62v24c0 .21 0 .42 0 .62L91.44 108.29c-.323-.157-.658-.291-1-.4L67.62 100.48c-.2-.07-.41-.12-.61-.17L59.01 73.37C68.539 61.369 81.024 52.051 95.24 46.33ZM82.24 175.42h-28.34C45.604 162.522 40.848 147.668 40.11 132.35l22-16.88c.189 .084 .383 .157 .58 .22l22.83 7.42c.305 .092 .616 .166 .93 .22l10.79 31.42c-.15 .18-.3 .36-.44 .55L82.7 174.71c-.166 .228-.32 .465-.46 .71ZM150.69 213c-14.868 3.96-30.512 3.96-45.38 0L95.25 184.6c.13-.16 .27-.31 .39-.48l14.11-19.42c.166-.225 .32-.458 .46-.7h35.58c.14 .242 .294 .475 .46 .7l14.11 19.42c.12 .17 .26 .32 .39 .48ZM173.76 175.39c-.14-.245-.294-.482-.46-.71L159.19 155.3c-.14-.19-.29-.37-.44-.55l10.79-31.42c.314-.054 .625-.128 .93-.22l22.83-7.42c.197-.063 .391-.136 .58-.22l22 16.88c-.738 15.318-5.494 30.172-13.79 43.07Z"),
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
        return _soccerBall!!
    }

private var _soccerBall: ImageVector? = null
