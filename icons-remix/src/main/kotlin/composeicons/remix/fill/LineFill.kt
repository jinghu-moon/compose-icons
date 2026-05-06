package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.LineFill: ImageVector
    get() {
        if (_lineFill != null) return _lineFill!!
        _lineFill = remixIcon(
            name = "LineFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M18.663 10.84c0 .288-.234 .525-.525 .525h-1.462v.938h1.462c.291 0 .525 .236 .525 .525 0 .287-.234 .524-.525 .524h-1.988c-.288 0-.523-.238-.523-.524v-3.976c0-.288 .235-.525 .525-.525h1.988c.288 0 .522 .238 .522 .525 0 .291-.234 .525-.525 .525h-1.462v.937h1.462c.291 0 .525 .238 .525 .526ZM14.566 13.325c-.053 .017-.111 .026-.166 .026-.176 0-.326-.075-.425-.208L11.939 10.378v2.45c0 .287-.232 .524-.526 .524-.288 0-.522-.238-.522-.524v-3.976c0-.225 .144-.425 .358-.496 .05-.019 .113-.028 .162-.028 .162 0 .312 .087 .412 .212l2.052 2.775v-2.463c0-.288 .235-.525 .525-.525 .288 0 .525 .238 .525 .525v3.976c0 .225-.145 .425-.36 .497ZM9.616 13.352c-.288 0-.523-.238-.523-.524v-3.976c0-.288 .235-.525 .525-.525 .288 0 .523 .238 .523 .525v3.976c0 .287-.235 .524-.526 .524ZM8.087 13.352h-1.988c-.288 0-.525-.238-.525-.524v-3.976c0-.288 .237-.525 .525-.525 .29 0 .525 .238 .525 .525v3.451h1.463c.29 0 .524 .236 .524 .525 0 .287-.235 .524-.524 .524ZM12.001 2.572C6.488 2.572 2.001 6.215 2.001 10.69c0 4.009 3.558 7.368 8.363 8.007 .326 .068 .769 .215 .882 .492 .1 .251 .066 .638 .032 .9l-.137 .85c-.037 .251-.2 .988 .874 .538 1.076-.449 5.763-3.398 7.863-5.812 1.437-1.574 2.123-3.187 2.123-4.973 0-4.476-4.487-8.118-10-8.118Z"),
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
        return _lineFill!!
    }

private var _lineFill: ImageVector? = null
