package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.NeteaseCloudMusicFill: ImageVector
    get() {
        if (_neteaseCloudMusicFill != null) return _neteaseCloudMusicFill!!
        _neteaseCloudMusicFill = remixIcon(
            name = "NeteaseCloudMusicFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12.001 22C6.478 22 2.001 17.523 2.001 12 2.001 6.477 6.478 2 12.001 2c5.523 0 10 4.477 10 10 0 5.523-4.477 10-10 10ZM10.915 11.568c.241-.841 1.075-1.542 1.99-1.648 .187 .694 .387 1.373 .545 2.062 .053 .23 .037 .495-.019 .727-.212 .892-1.247 1.242-1.977 .685-.531-.405-.742-1.119-.539-1.826ZM14.732 11.371c-.125-.464-.256-.927-.393-1.42 .499 .13 .907 .36 1.255 .698 1.257 1.221 1.385 3.3 .294 4.732-1.135 1.489-3.155 2.134-5.028 1.604C8.558 16.334 7.052 14.033 7.419 11.669 7.693 9.901 8.689 8.665 10.319 7.936c.407-.182 .58-.56 .42-.93-.157-.365-.541-.504-.944-.343C7.074 7.752 5.474 10.797 6.126 13.65c.712 3.118 3.494 5.162 6.674 4.859 1.732-.165 3.164-.948 4.216-2.347 1.506-2.002 1.298-4.783-.462-6.499C15.887 9.013 15.082 8.645 14.164 8.51c-.084-.012-.218-.052-.232-.105-.088-.313-.181-.632-.207-.954-.029-.358 .289-.641 .65-.645 .253-.003 .433 .131 .603 .3 .302 .3 .704 .322 .988 .063 .289-.264 .296-.678 .018-1.008-.566-.671-1.586-.891-2.43-.523-.848 .37-1.321 1.187-1.2 2.093 .038 .281 .109 .557 .167 .842-.091 .025-.176 .048-.261 .072-.856 .239-1.561 .704-2.097 1.414-.921 1.22-.937 2.827-.042 3.947 1.274 1.594 3.747 1.284 4.523-.569 .283-.676 .275-1.368 .087-2.065Z"),
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
        return _neteaseCloudMusicFill!!
    }

private var _neteaseCloudMusicFill: ImageVector? = null
