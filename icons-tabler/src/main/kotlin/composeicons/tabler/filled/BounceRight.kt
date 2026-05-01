package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.BounceRight: ImageVector
    get() {
        if (_bounceRight != null) return _bounceRight!!
        _bounceRight = tablerFilledIcon(
            name = "BounceRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(14.143f, 11.486f),
                    PathNode.CurveTo(14.436494f, 11.035153f, 15.034071f, 10.897287f, 15.495416f, 11.173986f),
                    PathNode.CurveTo(15.95676f, 11.450686f, 16.11653f, 12.042783f, 15.857f, 12.514f),
                    PathNode.CurveTo(14.355f, 15.019f, 13.447f, 17.404f, 12.987f, 20.164f),
                    PathNode.CurveTo(12.827f, 21.12f, 11.539f, 21.314f, 11.106f, 20.447f),
                    PathNode.CurveTo(9.046f, 16.327f, 7.248f, 15.471f, 4.316f, 16.449f),
                    PathNode.CurveTo(3.791882f, 16.623522f, 3.225522f, 16.340118f, 3.051f, 15.816f),
                    PathNode.CurveTo(2.876478f, 15.291882f, 3.159882f, 14.725522f, 3.684f, 14.551f),
                    PathNode.CurveTo(6.884f, 13.484f, 9.34f, 14.178f, 11.487f, 17.174f),
                    PathNode.LineTo(11.578f, 17.304f),
                    PathNode.LineTo(11.589f, 17.264f),
                    PathNode.CurveTo(12.111f, 15.436f, 12.856f, 13.714f, 13.862f, 11.964f),
                    PathNode.LineTo(14.142f, 11.486f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(18.0f, 4.0f),
                    PathNode.CurveTo(16.343145f, 4.0f, 15.0f, 5.343146f, 15.0f, 7.0f),
                    PathNode.CurveTo(15.0f, 8.656855f, 16.343145f, 10.0f, 18.0f, 10.0f),
                    PathNode.CurveTo(19.656855f, 10.0f, 21.0f, 8.656855f, 21.0f, 7.0f),
                    PathNode.CurveTo(21.0f, 5.343146f, 19.656855f, 4.0f, 18.0f, 4.0f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _bounceRight!!
    }

private var _bounceRight: ImageVector? = null
