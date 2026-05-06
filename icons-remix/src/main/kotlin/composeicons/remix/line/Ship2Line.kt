package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.Ship2Line: ImageVector
    get() {
        if (_ship2Line != null) return _ship2Line!!
        _ship2Line = remixIcon(
            name = "Ship2Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M9 4h5.446c.345 0 .665 .178 .848 .47L18.75 10h4.408c.276 0 .5 .224 .5 .5 0 .084-.021 .166-.061 .239L19.636 18h-.636c-.531 0-1.045-.069-1.535-.198L20.63 12h-17.23l1.048 5.824C3.984 17.939 3.499 18 3 18h-.545L1.214 11.179c-.099-.543 .262-1.064 .805-1.163C2.078 10.005 2.138 10 2.198 10h.802v-5C3 4.448 3.448 4 4 4h1v-3h4v3ZM5 10h11.392L13.892 6h-8.892v4ZM3 20c1.537 0 2.938-.578 4-1.528C8.062 19.422 9.463 20 11 20c1.537 0 2.939-.578 4-1.528 1.062 .95 2.463 1.528 4 1.528h2v2h-2c-1.457 0-2.823-.39-4-1.07C13.823 21.61 12.457 22 11 22 9.543 22 8.177 21.61 7 20.93 5.823 21.61 4.457 22 3 22h-2v-2h2Z"),
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
        return _ship2Line!!
    }

private var _ship2Line: ImageVector? = null
