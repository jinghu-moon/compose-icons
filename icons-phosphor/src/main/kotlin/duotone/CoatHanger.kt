package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.CoatHanger: ImageVector
    get() {
        if (_coatHanger != null) return _coatHanger!!
        _coatHanger = phosphorDuotoneIcon(
            name = "CoatHanger",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(232.0f, 192.0f),
                    PathNode.LineTo(24.0f, 192.0f),
                    PathNode.CurveTo(20.556557f, 192.0f, 17.499447f, 189.79655f, 16.410534f, 186.5298f),
                    PathNode.CurveTo(15.321621f, 183.26309f, 16.445246f, 179.66606f, 19.2f, 177.6f),
                    PathNode.LineTo(128.0f, 96.0f),
                    PathNode.LineTo(236.79f, 177.6f),
                    PathNode.CurveTo(239.54329f, 179.66496f, 240.66734f, 183.25941f, 239.58105f, 186.52509f),
                    PathNode.CurveTo(238.49477f, 189.79076f, 235.4416f, 191.9957f, 232.0f, 192.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
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
                    PathNode.LineTo(123.34f, 89.49f),
                    PathNode.LineTo(123.06f, 89.71f),
                    PathNode.LineTo(14.43f, 171.2f),
                    PathNode.CurveTo(8.924883f, 175.32881f, 6.676331f, 182.51515f, 8.846292f, 189.04544f),
                    PathNode.CurveTo(11.016253f, 195.57573f, 17.118631f, 199.9871f, 24.0f, 200.0f),
                    PathNode.LineTo(232.0f, 200.0f),
                    PathNode.CurveTo(238.88689f, 200.0f, 245.00111f, 195.59312f, 247.17894f, 189.05965f),
                    PathNode.CurveTo(249.35675f, 182.52617f, 247.10953f, 175.33214f, 241.6f, 171.2f),
                    PathNode.Close,
                    PathNode.MoveTo(232.0f, 184.0f),
                    PathNode.LineTo(24.0f, 184.0f),
                    PathNode.LineTo(128.0f, 106.0f),
                    PathNode.LineTo(232.0f, 184.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _coatHanger!!
    }

private var _coatHanger: ImageVector? = null
