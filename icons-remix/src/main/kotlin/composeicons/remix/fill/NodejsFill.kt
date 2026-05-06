package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.NodejsFill: ImageVector
    get() {
        if (_nodejsFill != null) return _nodejsFill!!
        _nodejsFill = remixIcon(
            name = "NodejsFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M11.174 22.555c.256 .139 .531 .218 .826 .218 .295 0 .59-.079 .826-.178l7.848-4.572c.511-.297 .826-.851 .826-1.445v-9.124c0-.594-.315-1.148-.826-1.445L12.826 1.438c-.492-.277-1.16-.277-1.652 0L3.326 6.01c-.511 .297-.826 .851-.826 1.445v9.124c0 .594 .315 1.148 .826 1.445l2.065 1.188c1.003 .495 1.357 .495 1.81 .495 1.475 0 2.321-.91 2.321-2.474v-9.005c0-.139-.118-.237-.236-.237h-1.003c-.138 0-.236 .119-.236 .237v9.005c0 .693-.728 1.385-1.888 .792L4.015 16.776c-.079-.039-.118-.138-.118-.218v-9.124c0-.079 .039-.178 .118-.218L11.863 2.665c.059-.04 .157-.04 .236 0l7.848 4.552c.078 .04 .118 .119 .118 .218v9.124c0 .099-.04 .178-.118 .218l-7.848 4.572c-.059 .04-.157 .04-.236 0L9.856 20.141c-.059-.04-.138-.059-.197-.02-.551 .317-.649 .356-1.18 .534-.118 .04-.315 .119 .079 .337l2.616 1.564ZM10.289 13.57c0 1.346 .708 2.929 4.151 2.929 2.478 0 3.914-.99 3.914-2.731 0-1.702-1.141-2.157-3.56-2.474-2.439-.317-2.695-.495-2.695-1.069 0-.475 .216-1.108 2.026-1.108 1.613 0 2.222 .356 2.459 1.445 .02 .099 .118 .178 .216 .178h1.042c.06 0 .118-.04 .158-.079 .039-.059 .059-.119 .059-.178C17.901 8.582 16.662 7.712 14.144 7.712c-2.242 0-3.58 .95-3.58 2.553 0 1.722 1.337 2.197 3.481 2.415 2.577 .257 2.774 .633 2.774 1.148 0 .891-.708 1.267-2.36 1.267-2.085 0-2.538-.515-2.695-1.564 0-.119-.098-.198-.216-.198h-1.023c-.138 0-.236 .119-.236 .238Z"),
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
        return _nodejsFill!!
    }

private var _nodejsFill: ImageVector? = null
