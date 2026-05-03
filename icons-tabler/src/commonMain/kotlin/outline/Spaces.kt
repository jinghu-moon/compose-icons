package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Spaces: ImageVector
    get() {
        if (_spaces != null) return _spaces!!
        _spaces = tablerOutlineIcon(
            name = "Spaces",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(6.045f, 9.777f),
                    PathNode.CurveTo(3.677076f, 11.117199f, 2.507403f, 13.883025f, 3.195266f, 16.515522f),
                    PathNode.CurveTo(3.883129f, 19.14802f, 6.256313f, 20.988108f, 8.977174f, 20.998625f),
                    PathNode.CurveTo(11.698035f, 21.00914f, 14.085372f, 19.18745f, 14.793563f, 16.560349f),
                    PathNode.CurveTo(15.501753f, 13.933247f, 14.353494f, 11.158463f, 11.996f, 9.8f)
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
                    PathNode.MoveTo(11.997f, 20.196f),
                    PathNode.CurveTo(14.286155f, 21.518675f, 17.171282f, 21.187122f, 19.100727f, 19.379656f),
                    PathNode.CurveTo(21.030172f, 17.572187f, 21.549166f, 14.714825f, 20.37859f, 12.344287f),
                    PathNode.CurveTo(19.208012f, 9.973749f, 16.623768f, 8.648772f, 14.015692f, 9.081944f),
                    PathNode.CurveTo(11.407616f, 9.515115f, 9.39043f, 11.604336f, 9.049f, 14.226f)
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
                    PathNode.MoveTo(17.95f, 9.785f),
                    PathNode.QuadTo(18.0f, 9.399f, 18.0f, 9.0f),
                    PathNode.CurveTo(17.999134f, 6.290534f, 16.182508f, 3.91784f, 13.567089f, 3.210178f),
                    PathNode.CurveTo(10.951669f, 2.502515f, 8.186502f, 3.635499f, 6.819556f, 5.974872f),
                    PathNode.CurveTo(5.45261f, 8.314245f, 5.82311f, 11.279467f, 7.723646f, 13.210572f),
                    PathNode.CurveTo(9.624182f, 15.141679f, 12.583114f, 15.559444f, 14.944f, 14.23f)
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
        return _spaces!!
    }

private var _spaces: ImageVector? = null
