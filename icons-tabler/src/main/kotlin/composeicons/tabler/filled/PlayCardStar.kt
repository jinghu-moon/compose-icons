package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.PlayCardStar: ImageVector
    get() {
        if (_playCardStar != null) return _playCardStar!!
        _playCardStar = tablerFilledIcon(
            name = "PlayCardStar",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M17 2c1.657 0 3 1.343 3 3v14c0 1.657-1.343 3-3 3h-10C5.343 22 4 20.657 4 19v-14C4 3.343 5.343 2 7 2ZM17.01 18h-.01c-.529 .001-.966 .413-.997 .941-.031 .528 .355 .989 .88 1.052l.127 .007c.552 0 1-.448 1-1 0-.552-.448-1-1-1M12.03 8.5l-.115 .005c-.384 .04-.724 .273-.898 .623l-.51 1.027-1.138 .166c-.423 .059-.78 .357-.914 .768l-.033 .125c-.077 .379 .044 .771 .322 1.039l.82 .797-.194 1.127c-.07 .432 .107 .857 .454 1.108l.107 .068c.333 .188 .739 .195 1.078 .018l1.022-.536 1.019 .535c.377 .2 .84 .168 1.19-.086l.1-.08c.281-.259 .416-.645 .35-1.028l-.194-1.126 .823-.799c.31-.302 .42-.752 .287-1.161l-.042-.11c-.158-.355-.488-.604-.873-.659l-1.138-.166L13.045 9.129c-.19-.386-.584-.63-1.014-.63M7.01 4h-.01c-.529 .001-.966 .413-.997 .941-.031 .528 .355 .989 .88 1.052L7.01 6c.552 0 1-.448 1-1 0-.552-.448-1-1-1"),
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
        return _playCardStar!!
    }

private var _playCardStar: ImageVector? = null
