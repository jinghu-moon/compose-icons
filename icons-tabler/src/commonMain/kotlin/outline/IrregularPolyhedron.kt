package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.IrregularPolyhedron: ImageVector
    get() {
        if (_irregularPolyhedron != null) return _irregularPolyhedron!!
        _irregularPolyhedron = tablerOutlineIcon(
            name = "IrregularPolyhedron",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(6.0f, 12.0f),
                    PathNode.LineTo(4.248f, 18.13f),
                    PathNode.CurveTo(4.106295f, 18.62412f, 4.362288f, 19.14519f, 4.84f, 19.335f),
                    PathNode.LineTo(11.122f, 21.838f),
                    PathNode.CurveTo(11.687402f, 22.054026f, 12.312598f, 22.054026f, 12.878f, 21.838f),
                    PathNode.LineTo(19.16f, 19.335f),
                    PathNode.CurveTo(19.637228f, 19.14523f, 19.893116f, 18.624807f, 19.752f, 18.131f),
                    PathNode.LineTo(18.0f, 12.0f),
                    PathNode.LineTo(19.752f, 5.87f),
                    PathNode.CurveTo(19.893705f, 5.375879f, 19.637712f, 4.85481f, 19.16f, 4.665f),
                    PathNode.LineTo(12.878f, 2.162f),
                    PathNode.CurveTo(12.312598f, 1.945975f, 11.687402f, 1.945975f, 11.122f, 2.162f),
                    PathNode.LineTo(4.84f, 4.665f),
                    PathNode.CurveTo(4.362772f, 4.854771f, 4.106883f, 5.375192f, 4.248f, 5.869f),
                    PathNode.LineTo(6.0f, 12.0f)
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
                    PathNode.MoveTo(4.5f, 5.5f),
                    PathNode.LineTo(11.122f, 7.83f),
                    PathNode.CurveTo(11.685343f, 8.056907f, 12.314657f, 8.056907f, 12.878f, 7.83f),
                    PathNode.LineTo(19.5f, 5.5f)
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
                    PathNode.MoveTo(6.0f, 12.0f),
                    PathNode.LineTo(11.21f, 13.862f),
                    PathNode.CurveTo(11.720738f, 14.045184f, 12.279262f, 14.045184f, 12.79f, 13.862f),
                    PathNode.LineTo(18.0f, 12.0f)
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
                    PathNode.MoveTo(12.0f, 22.0f),
                    PathNode.LineTo(12.0f, 8.0f)
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
        return _irregularPolyhedron!!
    }

private var _irregularPolyhedron: ImageVector? = null
