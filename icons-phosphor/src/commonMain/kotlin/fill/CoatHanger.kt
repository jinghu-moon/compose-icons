package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.CoatHanger: ImageVector
    get() {
        if (_coatHanger != null) return _coatHanger!!
        _coatHanger = phosphorFillIcon(
            name = "CoatHanger",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(241.57f, 171.2f),
                    PathNode.LineTo(141.33f, 96.0f),
                    PathNode.LineTo(164.79f, 78.4f),
                    PathNode.CurveTo(166.80821f, 76.89126f, 167.99763f, 74.51982f, 168.0f, 72.0f),
                    PathNode.CurveTo(168.0f, 49.90861f, 150.09138f, 32.0f, 128.0f, 32.0f),
                    PathNode.CurveTo(105.90861f, 32.0f, 88.0f, 49.90861f, 88.0f, 72.0f),
                    PathNode.CurveTo(88.0f, 76.41828f, 91.58172f, 80.0f, 96.0f, 80.0f),
                    PathNode.CurveTo(100.41828f, 80.0f, 104.0f, 76.41828f, 104.0f, 72.0f),
                    PathNode.CurveTo(104.033554f, 59.505386f, 113.64798f, 49.12674f, 126.10358f, 48.13949f),
                    PathNode.CurveTo(138.55917f, 47.152233f, 149.68854f, 55.88669f, 151.69f, 68.22f),
                    PathNode.LineTo(14.43f, 171.2f),
                    PathNode.CurveTo(8.924883f, 175.32881f, 6.676331f, 182.51515f, 8.846292f, 189.04544f),
                    PathNode.CurveTo(11.016253f, 195.57573f, 17.118631f, 199.9871f, 24.0f, 200.0f),
                    PathNode.LineTo(232.0f, 200.0f),
                    PathNode.CurveTo(238.88689f, 200.0f, 245.00111f, 195.59312f, 247.17894f, 189.05965f),
                    PathNode.CurveTo(249.35675f, 182.52617f, 247.10953f, 175.33214f, 241.6f, 171.2f),
                    PathNode.Close,
                    PathNode.MoveTo(32.73f, 184.0f),
                    PathNode.CurveTo(53.6f, 170.59f, 89.49f, 152.0f, 128.0f, 152.0f),
                    PathNode.CurveTo(166.51f, 152.0f, 202.4f, 170.59f, 223.27f, 184.0f),
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
        return _coatHanger!!
    }

private var _coatHanger: ImageVector? = null
