package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Puzzle: ImageVector
    get() {
        if (_puzzle != null) return _puzzle!!
        _puzzle = lucideOutlineIcon(
            name = "Puzzle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(15.39f, 4.39f),
                    PathNode.CurveTo(15.64596f, 4.646219f, 16.020449f, 4.74402f, 16.369005f, 4.645677f),
                    PathNode.CurveTo(16.717562f, 4.547334f, 16.985706f, 4.268219f, 17.07f, 3.916f),
                    PathNode.CurveTo(17.357252f, 2.720275f, 18.471445f, 1.911025f, 19.697384f, 2.007704f),
                    PathNode.CurveTo(20.923323f, 2.104384f, 21.896894f, 3.078279f, 21.993168f, 4.30425f),
                    PathNode.CurveTo(22.08944f, 5.53022f, 21.27982f, 6.644145f, 20.084f, 6.931f),
                    PathNode.CurveTo(19.731783f, 7.015294f, 19.452665f, 7.283438f, 19.354322f, 7.631995f),
                    PathNode.CurveTo(19.255981f, 7.980552f, 19.353783f, 8.355041f, 19.61f, 8.611f),
                    PathNode.LineTo(21.293f, 10.293f),
                    PathNode.CurveTo(21.745737f, 10.745716f, 22.000088f, 11.359746f, 22.000088f, 12.0f),
                    PathNode.CurveTo(22.000088f, 12.640254f, 21.745737f, 13.254284f, 21.293f, 13.707f),
                    PathNode.LineTo(19.61f, 15.39f),
                    PathNode.CurveTo(19.35404f, 15.646218f, 18.979551f, 15.74402f, 18.630995f, 15.645677f),
                    PathNode.CurveTo(18.282438f, 15.547334f, 18.014294f, 15.268218f, 17.93f, 14.916f),
                    PathNode.CurveTo(17.642748f, 13.720275f, 16.528555f, 12.911025f, 15.302616f, 13.007705f),
                    PathNode.CurveTo(14.076677f, 13.104383f, 13.103106f, 14.078279f, 13.006833f, 15.304249f),
                    PathNode.CurveTo(12.91056f, 16.53022f, 13.72018f, 17.644144f, 14.916f, 17.931f),
                    PathNode.CurveTo(15.268218f, 18.015293f, 15.547334f, 18.283438f, 15.645677f, 18.631994f),
                    PathNode.CurveTo(15.74402f, 18.98055f, 15.646218f, 19.35504f, 15.39f, 19.611f),
                    PathNode.LineTo(13.707f, 21.293f),
                    PathNode.CurveTo(13.254284f, 21.745737f, 12.640254f, 22.000088f, 12.0f, 22.000088f),
                    PathNode.CurveTo(11.359746f, 22.000088f, 10.745716f, 21.745737f, 10.293f, 21.293f),
                    PathNode.LineTo(8.61f, 19.61f),
                    PathNode.CurveTo(8.35404f, 19.353783f, 7.979552f, 19.255981f, 7.630995f, 19.354322f),
                    PathNode.CurveTo(7.282438f, 19.452665f, 7.014294f, 19.731783f, 6.93f, 20.084f),
                    PathNode.CurveTo(6.642749f, 21.279724f, 5.528555f, 22.088976f, 4.302616f, 21.992296f),
                    PathNode.CurveTo(3.076678f, 21.895617f, 2.103106f, 20.92172f, 2.006833f, 19.695751f),
                    PathNode.CurveTo(1.91056f, 18.46978f, 2.72018f, 17.355856f, 3.916f, 17.069f),
                    PathNode.CurveTo(4.268219f, 16.984707f, 4.547334f, 16.716562f, 4.645677f, 16.368006f),
                    PathNode.CurveTo(4.74402f, 16.01945f, 4.646219f, 15.644959f, 4.39f, 15.389f),
                    PathNode.LineTo(2.707f, 13.707f),
                    PathNode.CurveTo(2.25426f, 13.254284f, 1.999912f, 12.640254f, 1.999912f, 12.0f),
                    PathNode.CurveTo(1.999912f, 11.359746f, 2.25426f, 10.745716f, 2.707f, 10.293f),
                    PathNode.LineTo(4.39f, 8.61f),
                    PathNode.CurveTo(4.64596f, 8.353782f, 5.020448f, 8.255981f, 5.369005f, 8.354324f),
                    PathNode.CurveTo(5.717562f, 8.452666f, 5.985707f, 8.731782f, 6.07f, 9.084f),
                    PathNode.CurveTo(6.357252f, 10.279725f, 7.471446f, 11.088975f, 8.697384f, 10.992295f),
                    PathNode.CurveTo(9.923323f, 10.895617f, 10.896894f, 9.921721f, 10.993167f, 8.695751f),
                    PathNode.CurveTo(11.08944f, 7.469781f, 10.27982f, 6.355855f, 9.084f, 6.069f),
                    PathNode.CurveTo(8.731782f, 5.984707f, 8.452666f, 5.716562f, 8.354324f, 5.368006f),
                    PathNode.CurveTo(8.255981f, 5.019449f, 8.353782f, 4.64496f, 8.61f, 4.389f),
                    PathNode.LineTo(10.293f, 2.707f),
                    PathNode.CurveTo(10.745716f, 2.25426f, 11.359746f, 1.999912f, 12.0f, 1.999912f),
                    PathNode.CurveTo(12.640254f, 1.999912f, 13.254284f, 2.25426f, 13.707f, 2.707f),
                    PathNode.Close
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
        return _puzzle!!
    }

private var _puzzle: ImageVector? = null
