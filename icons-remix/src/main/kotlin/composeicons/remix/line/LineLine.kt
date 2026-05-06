package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.LineLine: ImageVector
    get() {
        if (_lineLine != null) return _lineLine!!
        _lineLine = remixIcon(
            name = "LineLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M22.001 10.69c0 1.787-.687 3.399-2.123 4.973-2.1 2.414-6.787 5.363-7.863 5.812-1.074 .451-.912-.287-.874-.538l.137-.85c.034-.262 .068-.649-.032-.9-.113-.277-.556-.423-.882-.492C5.559 18.059 2.001 14.7 2.001 10.69 2.001 6.215 6.488 2.572 12.001 2.572c5.512 0 10 3.642 10 8.118ZM18.4 14.316c1.114-1.22 1.601-2.361 1.601-3.625 0-3.268-3.511-6.118-8-6.118-4.489 0-8 2.85-8 6.118 0 2.905 2.728 5.506 6.626 6.024l.147 .025c1.078 .226 1.884 .614 2.329 1.708 .013 .032 .025 .064 .037 .096 1.805-1.176 4.174-2.979 5.261-4.228ZM18.139 10.314c.291 0 .525 .238 .525 .526 0 .288-.234 .525-.525 .525h-1.462v.938h1.462c.291 0 .525 .236 .525 .525 0 .287-.234 .524-.525 .524h-1.988c-.288 0-.523-.238-.523-.524v-3.976c0-.288 .235-.525 .525-.525h1.988c.288 0 .522 .238 .522 .525 0 .291-.234 .525-.525 .525h-1.462v.937h1.462ZM14.926 12.828c0 .225-.145 .425-.36 .497-.053 .017-.111 .026-.166 .026-.176 0-.326-.075-.425-.208L11.939 10.378v2.45c0 .287-.232 .524-.526 .524-.288 0-.522-.238-.522-.524v-3.976c0-.225 .144-.425 .358-.496 .05-.019 .113-.028 .162-.028 .162 0 .312 .087 .412 .212l2.052 2.775v-2.463c0-.288 .235-.525 .525-.525 .288 0 .525 .238 .525 .525v3.976ZM10.142 12.828c0 .287-.235 .524-.526 .524-.288 0-.523-.238-.523-.524v-3.976c0-.288 .235-.525 .525-.525 .288 0 .523 .238 .523 .525v3.976ZM8.087 13.352h-1.988c-.288 0-.525-.238-.525-.524v-3.976c0-.288 .237-.525 .525-.525 .29 0 .525 .238 .525 .525v3.451h1.463c.29 0 .524 .236 .524 .525 0 .287-.235 .524-.524 .524Z"),
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
        return _lineLine!!
    }

private var _lineLine: ImageVector? = null
