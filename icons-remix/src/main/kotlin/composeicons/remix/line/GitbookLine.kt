package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.GitbookLine: ImageVector
    get() {
        if (_gitbookLine != null) return _gitbookLine!!
        _gitbookLine = remixIcon(
            name = "GitbookLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M11.979 2.638c.315-.185 .706-.183 1.019 .004l7.513 4.495c.302 .181 .486 .507 .486 .858 0 .352-.185 .677-.486 .857l-7.513 4.495c-.316 .189-.71 .189-1.026 0L7.82 10.863c-1.195-.687-2.721-.276-3.41 .918-.131 .227-.223 .463-.276 .703-.088 .391-.026 .973 .26 1.616 .071 .16 .151 .316 .241 .467 .32 .533 .772 1.035 1.34 1.422 .092 .062 .186 .122 .284 .179l.008 .004 5.202 3.052c.628 .368 1.407 .368 2.035 0L20 15.412v-1.903l-6.999 4.208c-.316 .19-.71 .191-1.026 .003L6.227 14.302c-.474-.282-.631-.896-.349-1.37 .282-.475 .896-.631 1.371-.349l5.234 3.111 8.001-4.811c.309-.186 .694-.191 1.008-.014 .314 .177 .508 .51 .508 .87v4.245c0 .355-.188 .684-.494 .863l-6.99 4.101c-1.253 .735-2.807 .735-4.059 0L5.254 17.897c-.128-.074-.253-.152-.374-.233l-.037-.025c-.084-.058-.166-.118-.247-.179C3.945 16.972 3.409 16.378 2.995 15.718c-.033-.052-.064-.104-.095-.156-.03-.05-.059-.1-.087-.151-.033-.059-.066-.118-.097-.178-.01-.019-.018-.039-.027-.059-.038-.075-.073-.152-.107-.229-.024-.053-.048-.106-.07-.159C2.177 13.99 2 13.133 2 12.266c0-1.1 .281-2.214 .87-3.232C3.505 7.925 4.462 7.047 5.531 6.42L11.979 2.638ZM6.543 8.146c-.228 .134-.444 .281-.647 .438 .905-.139 1.857-.004 2.726 .44l.204 .11 .013 .008 3.648 2.183L18.051 7.994 12.481 4.662 6.543 8.146Z"),
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
        return _gitbookLine!!
    }

private var _gitbookLine: ImageVector? = null
