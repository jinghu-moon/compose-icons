package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandGoogle: ImageVector
    get() {
        if (_brandGoogle != null) return _brandGoogle!!
        _brandGoogle = tablerOutlineIcon(
            name = "BrandGoogle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(20.945f, 11.0f),
                    PathNode.CurveTo(21.422775f, 15.272223f, 18.8125f, 19.285885f, 14.713585f, 20.581669f),
                    PathNode.CurveTo(10.614671f, 21.877453f, 6.17162f, 20.093548f, 4.106851f, 16.323019f),
                    PathNode.CurveTo(2.042083f, 12.55249f, 2.932124f, 7.848148f, 6.231613f, 5.092513f),
                    PathNode.CurveTo(9.531103f, 2.336878f, 14.318754f, 2.299382f, 17.661f, 5.003f),
                    PathNode.LineTo(15.006f, 7.395f),
                    PathNode.CurveTo(13.056092f, 6.122971f, 10.516515f, 6.216443f, 8.665393f, 7.628372f),
                    PathNode.CurveTo(6.81427f, 9.040301f, 6.052657f, 11.464787f, 6.763859f, 13.68163f),
                    PathNode.CurveTo(7.475061f, 15.898472f, 9.504993f, 17.427382f, 11.832026f, 17.498886f),
                    PathNode.CurveTo(14.15906f, 17.570389f, 16.279034f, 16.168995f, 17.125f, 14.0f),
                    PathNode.LineTo(13.0f, 14.0f),
                    PathNode.LineTo(13.0f, 11.0f),
                    PathNode.LineTo(20.945f, 11.0f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _brandGoogle!!
    }

private var _brandGoogle: ImageVector? = null
