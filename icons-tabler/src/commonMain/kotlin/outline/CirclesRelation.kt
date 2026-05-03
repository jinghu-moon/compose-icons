package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CirclesRelation: ImageVector
    get() {
        if (_circlesRelation != null) return _circlesRelation!!
        _circlesRelation = tablerOutlineIcon(
            name = "CirclesRelation",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(9.183f, 6.117f),
                    PathNode.CurveTo(6.522604f, 5.582721f, 3.834764f, 6.900487f, 2.627819f, 9.330804f),
                    PathNode.CurveTo(1.420874f, 11.761122f, 1.995281f, 14.698986f, 4.0287f, 16.495752f),
                    PathNode.CurveTo(6.06212f, 18.292517f, 9.048349f, 18.500895f, 11.311604f, 17.00395f),
                    PathNode.CurveTo(13.574857f, 15.507007f, 14.551718f, 12.677389f, 13.694f, 10.103f)
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
                    PathNode.MoveTo(14.813f, 17.883f),
                    PathNode.CurveTo(17.476393f, 18.420021f, 20.16825f, 17.100267f, 21.374826f, 14.665884f),
                    PathNode.CurveTo(22.581406f, 12.231502f, 22.00153f, 9.290142f, 19.961288f, 7.495855f),
                    PathNode.CurveTo(17.921047f, 5.701568f, 14.929708f, 5.502228f, 12.669424f, 7.009932f),
                    PathNode.CurveTo(10.409141f, 8.517635f, 9.444106f, 11.356043f, 10.317f, 13.929f)
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
        return _circlesRelation!!
    }

private var _circlesRelation: ImageVector? = null
