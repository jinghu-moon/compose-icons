package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Caravan: ImageVector
    get() {
        if (_caravan != null) return _caravan!!
        _caravan = tablerFilledIcon(
            name = "Caravan",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(15.949f, 3.684f),
                    PathNode.LineTo(16.72f, 6.0f),
                    PathNode.LineTo(18.0f, 6.0f),
                    PathNode.CurveTo(19.656855f, 6.0f, 21.0f, 7.343146f, 21.0f, 9.0f),
                    PathNode.LineTo(21.0f, 15.0f),
                    PathNode.LineTo(22.0f, 15.0f),
                    PathNode.CurveTo(22.552284f, 15.0f, 23.0f, 15.447715f, 23.0f, 16.0f),
                    PathNode.CurveTo(23.0f, 16.552284f, 22.552284f, 17.0f, 22.0f, 17.0f),
                    PathNode.LineTo(20.83f, 17.0f),
                    PathNode.CurveTo(20.406025f, 18.199184f, 19.271927f, 19.000668f, 18.0f, 19.0f),
                    PathNode.LineTo(11.83f, 19.0f),
                    PathNode.CurveTo(11.406601f, 20.19996f, 10.272467f, 21.00245f, 9.0f, 21.00245f),
                    PathNode.CurveTo(7.727533f, 21.00245f, 6.5934f, 20.19996f, 6.17f, 19.0f),
                    PathNode.LineTo(5.0f, 19.0f),
                    PathNode.CurveTo(3.343146f, 19.0f, 2.0f, 17.656855f, 2.0f, 16.0f),
                    PathNode.LineTo(2.0f, 12.5f),
                    PathNode.CurveTo(1.999521f, 9.229896f, 4.428537f, 6.468561f, 7.672f, 6.052f),
                    PathNode.LineTo(14.606f, 3.081f),
                    PathNode.CurveTo(14.863095f, 2.970709f, 15.154635f, 2.973154f, 15.409844f, 3.087742f),
                    PathNode.CurveTo(15.665054f, 3.20233f, 15.860596f, 3.418582f, 15.949f, 3.684f),
                    PathNode.MoveTo(9.0f, 17.0f),
                    PathNode.CurveTo(8.447715f, 17.0f, 8.0f, 17.447716f, 8.0f, 18.0f),
                    PathNode.CurveTo(8.0f, 18.552284f, 8.447715f, 19.0f, 9.0f, 19.0f),
                    PathNode.CurveTo(9.552285f, 19.0f, 10.0f, 18.552284f, 10.0f, 18.0f),
                    PathNode.CurveTo(10.0f, 17.447716f, 9.552285f, 17.0f, 9.0f, 17.0f),
                    PathNode.MoveTo(14.5f, 10.0f),
                    PathNode.LineTo(13.5f, 10.0f),
                    PathNode.CurveTo(12.671573f, 10.0f, 12.0f, 10.671573f, 12.0f, 11.5f),
                    PathNode.LineTo(12.0f, 12.5f),
                    PathNode.CurveTo(12.0f, 13.328427f, 12.671573f, 14.0f, 13.5f, 14.0f),
                    PathNode.LineTo(14.5f, 14.0f),
                    PathNode.CurveTo(15.328427f, 14.0f, 16.0f, 13.328427f, 16.0f, 12.5f),
                    PathNode.LineTo(16.0f, 11.5f),
                    PathNode.CurveTo(16.0f, 10.671573f, 15.328427f, 10.0f, 14.5f, 10.0f),
                    PathNode.MoveTo(14.395f, 5.347f),
                    PathNode.LineTo(12.871f, 6.0f),
                    PathNode.LineTo(14.613f, 6.0f),
                    PathNode.Close
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
        return _caravan!!
    }

private var _caravan: ImageVector? = null
