package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.AmazonLine: ImageVector
    get() {
        if (_amazonLine != null) return _amazonLine!!
        _amazonLine = remixIcon(
            name = "AmazonLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M15.626 14.62c-1.107 1.618-2.729 2.384-4.625 2.384-2.304 0-4.276-1.773-3.993-4.124C7.322 10.272 9.347 9.15 12.716 8.737c.601-.074 .85-.094 2.147-.19 .049-.004 .095-.007 .138-.01-0-.071-0-.143-0-.215 0-1.796-1.068-3.022-2.5-3.022-1.437 0-2.44 .747-3.055 2.526L7.555 7.174C8.443 4.604 10.193 3.3 12.501 3.3c2.603 0 4.5 2.178 4.5 5.022 0 2.649 .163 4.756 .483 5.558 .356 .892 .486 1.116 .884 1.613l-1.56 1.251c-.523-.652-.753-1.049-1.181-2.123l-0-.001ZM21.257 20.545c-.271 .2-.742 .081-.528-.441 .265-.648 .547-1.408 .262-1.752-.21-.255-.468-.382-1.027-.382-.46 0-.69 .059-.995 .08-.204 .014-.293-.297-.091-.44 .262-.185 .544-.33 .871-.428 1.15-.344 2.505-.156 2.669 .083 .365 .53-.198 2.569-1.16 3.279ZM20.075 19.461c-.262 .256-.545 .489-.829 .695-2.123 1.616-4.871 2.461-7.259 2.461-3.842 0-7.28-1.794-9.887-4.796-.224-.231-.039-.566 .223-.384 2.809 2.077 6.288 3.333 9.888 3.333 2.266 0 4.708-.537 7.035-1.692 .162-.077 .344-.181 .504-.255 .367-.21 .689 .306 .325 .638ZM15.011 10.541c-1.259 .093-1.496 .113-2.052 .181-2.553 .312-3.797 1.002-3.966 2.397-.126 1.043 .81 1.884 2.007 1.884 2.039 0 3.517-1.228 4.022-4.464-.004 0-.008 0-.012 .001Z"),
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
        return _amazonLine!!
    }

private var _amazonLine: ImageVector? = null
