package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.GithubFill: ImageVector
    get() {
        if (_githubFill != null) return _githubFill!!
        _githubFill = remixIcon(
            name = "GithubFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12.001 2C6.476 2 2.001 6.475 2.001 12c0 4.425 2.863 8.163 6.838 9.487 .5 .088 .688-.212 .688-.475 0-.238-.012-1.025-.012-1.863C7.001 19.612 6.351 18.538 6.151 17.975 6.038 17.688 5.551 16.8 5.126 16.562c-.35-.188-.85-.65-.012-.663 .787-.012 1.35 .725 1.537 1.025 .9 1.513 2.337 1.088 2.913 .825 .087-.65 .35-1.087 .638-1.337C7.976 16.163 5.651 15.3 5.651 11.475c0-1.088 .387-1.988 1.025-2.688C6.576 8.538 6.226 7.512 6.776 6.137c0 0 .838-.262 2.75 1.025 .8-.225 1.65-.338 2.5-.338 .85 0 1.7 .113 2.5 .338C16.438 5.863 17.276 6.137 17.276 6.137c.55 1.375 .2 2.4 .1 2.65 .638 .7 1.025 1.587 1.025 2.688 0 3.837-2.337 4.688-4.562 4.938 .363 .312 .675 .913 .675 1.85 0 1.337-.012 2.412-.012 2.75 0 .262 .188 .575 .688 .475C19.259 20.113 22 16.296 22.001 12 22.001 6.475 17.526 2 12.001 2Z"),
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
        return _githubFill!!
    }

private var _githubFill: ImageVector? = null
