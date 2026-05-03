package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.BrandSpotify: ImageVector
    get() {
        if (_brandSpotify != null) return _brandSpotify!!
        _brandSpotify = tablerFilledIcon(
            name = "BrandSpotify",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(17.0f, 3.34f),
                    PathNode.CurveTo(21.202793f, 5.766485f, 23.05675f, 10.86025f, 21.396896f, 15.420535f),
                    PathNode.CurveTo(19.737045f, 19.98082f, 15.042578f, 22.691092f, 10.263351f, 21.848303f),
                    PathNode.CurveTo(5.484125f, 21.005512f, 1.999877f, 16.852968f, 2.0f, 12.0f),
                    PathNode.LineTo(2.005f, 11.676f),
                    PathNode.CurveTo(2.118919f, 8.162982f, 4.068822f, 4.967704f, 7.140892f, 3.259883f),
                    PathNode.CurveTo(10.212963f, 1.552061f, 13.95609f, 1.582479f, 17.0f, 3.34f),
                    PathNode.MoveTo(14.832f, 14.945f),
                    PathNode.CurveTo(13.547f, 13.018f, 10.478f, 12.813f, 8.445f, 14.168f),
                    PathNode.CurveTo(7.985499f, 14.474518f, 7.861482f, 15.095499f, 8.168f, 15.555f),
                    PathNode.CurveTo(8.474518f, 16.014502f, 9.095499f, 16.138517f, 9.555f, 15.832f),
                    PathNode.CurveTo(10.75f, 15.035f, 12.569f, 15.157f, 13.168f, 16.055f),
                    PathNode.CurveTo(13.474518f, 16.514502f, 14.095499f, 16.638517f, 14.555f, 16.332f),
                    PathNode.CurveTo(15.014501f, 16.025482f, 15.138518f, 15.404501f, 14.832f, 14.945f),
                    PathNode.MoveTo(16.1f, 11.7f),
                    PathNode.CurveTo(13.631f, 9.848f, 10.205f, 9.513f, 7.492f, 11.111f),
                    PathNode.CurveTo(7.015931f, 11.391561f, 6.85744f, 12.00493f, 7.138f, 12.481f),
                    PathNode.CurveTo(7.418561f, 12.957069f, 8.031931f, 13.115561f, 8.508f, 12.835f),
                    PathNode.CurveTo(10.494f, 11.664f, 13.052f, 11.915f, 14.9f, 13.3f),
                    PathNode.CurveTo(15.341827f, 13.631371f, 15.968629f, 13.541828f, 16.3f, 13.1f),
                    PathNode.CurveTo(16.63137f, 12.658173f, 16.541828f, 12.031371f, 16.1f, 11.7f),
                    PathNode.MoveTo(17.53f, 8.652f),
                    PathNode.CurveTo(13.853f, 6.354f, 9.764f, 6.5f, 6.553f, 8.106f),
                    PathNode.CurveTo(6.077481f, 8.362426f, 5.891605f, 8.950176f, 6.133214f, 9.433393f),
                    PathNode.CurveTo(6.374822f, 9.91661f, 6.956548f, 10.12056f, 7.447f, 9.894f),
                    PathNode.CurveTo(10.082f, 8.577f, 13.444f, 8.457f, 16.47f, 10.348f),
                    PathNode.CurveTo(16.938337f, 10.640711f, 17.555288f, 10.498338f, 17.848f, 10.03f),
                    PathNode.CurveTo(18.14071f, 9.561663f, 17.998337f, 8.944711f, 17.53f, 8.652f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _brandSpotify!!
    }

private var _brandSpotify: ImageVector? = null
