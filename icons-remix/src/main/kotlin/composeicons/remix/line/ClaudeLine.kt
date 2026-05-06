package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.ClaudeLine: ImageVector
    get() {
        if (_claudeLine != null) return _claudeLine!!
        _claudeLine = remixIcon(
            name = "ClaudeLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M8.644 2.553C8.397 2.059 7.797 1.859 7.303 2.106c-.494 .247-.694 .848-.447 1.342L9.681 9.099 5.067 5.926C4.611 5.613 3.989 5.728 3.676 6.183c-.313 .455-.198 1.078 .258 1.391l5.472 3.762L3.053 11.001c-.552-.029-1.022 .394-1.051 .946-.029 .552 .395 1.022 .946 1.051l5.794 .305L4.445 16.168c-.46 .306-.584 .927-.277 1.387 .306 .459 .927 .584 1.387 .277L9.197 15.404 6.686 18.919c-.321 .449-.217 1.074 .233 1.395 .449 .321 1.074 .217 1.395-.233l3.033-4.247-.833 5.001c-.091 .545 .277 1.06 .822 1.151 .545 .091 1.06-.277 1.151-.822l.802-4.811 2.371 3.688c.299 .465 .917 .599 1.382 .3 .465-.299 .599-.917 .3-1.382L15.555 16.181l2.766 2.554c.406 .375 1.039 .349 1.413-.056 .375-.406 .349-1.039-.056-1.413L16.643 14.463l4.233 .529c.548 .068 1.048-.32 1.116-.868 .069-.548-.32-1.048-.868-1.116l-4.19-.524 4.295-1.011c.538-.127 .871-.665 .744-1.202-.126-.538-.665-.871-1.202-.744l-5.589 1.315L19.286 5.618c.341-.434 .266-1.063-.169-1.404-.434-.341-1.063-.266-1.404 .168L13.857 9.29l.881-5.636c.085-.546-.288-1.057-.834-1.142-.546-.085-1.057 .288-1.142 .834l-.886 5.67L8.644 2.553Z"),
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
        return _claudeLine!!
    }

private var _claudeLine: ImageVector? = null
