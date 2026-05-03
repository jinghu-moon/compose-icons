package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Meteor: ImageVector
    get() {
        if (_meteor != null) return _meteor!!
        _meteor = tablerOutlineIcon(
            name = "Meteor",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(21.0f, 3.0f),
                    PathNode.LineTo(16.0f, 12.0f),
                    PathNode.LineTo(21.0f, 12.0f),
                    PathNode.LineTo(14.109f, 19.086f),
                    PathNode.CurveTo(12.428693f, 20.76984f, 9.962785f, 21.401293f, 7.679981f, 20.732296f),
                    PathNode.CurveTo(5.397177f, 20.063301f, 3.662163f, 18.200733f, 3.156521f, 15.876282f),
                    PathNode.CurveTo(2.650878f, 13.551829f, 3.455385f, 11.136835f, 5.254f, 9.58f),
                    PathNode.LineTo(13.0f, 3.0f),
                    PathNode.LineTo(12.0f, 8.0f),
                    PathNode.LineTo(21.0f, 3.0f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1.0f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1.0f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(7.0f, 14.5f),
                    PathNode.CurveTo(7.0f, 15.880712f, 8.119289f, 17.0f, 9.5f, 17.0f),
                    PathNode.CurveTo(10.880712f, 17.0f, 12.0f, 15.880712f, 12.0f, 14.5f),
                    PathNode.CurveTo(12.0f, 13.119288f, 10.880712f, 12.0f, 9.5f, 12.0f),
                    PathNode.CurveTo(8.119289f, 12.0f, 7.0f, 13.119288f, 7.0f, 14.5f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1.0f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1.0f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _meteor!!
    }

private var _meteor: ImageVector? = null
