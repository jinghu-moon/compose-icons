package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.PlanetLine: ImageVector
    get() {
        if (_planetLine != null) return _planetLine!!
        _planetLine = remixIcon(
            name = "PlanetLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M3.918 8.037C3.33 9.233 3 10.579 3 12c0 4.971 4.029 9 9 9 1.422 0 2.768-.33 3.966-.919 .873 .373 1.719 .618 2.491 .681 .902 .073 1.844-.096 2.525-.777 .752-.752 .881-1.816 .746-2.812-.123-.909-.48-1.919-1.002-2.961C20.905 13.503 21 12.762 21 12 21 7.029 16.971 3 12 3c-.761 0-1.501 .095-2.209 .273C8.747 2.75 7.736 2.392 6.826 2.268 5.829 2.133 4.764 2.261 4.011 3.014c-.683 .683-.851 1.625-.777 2.528 .063 .773 .309 1.62 .684 2.494ZM5.322 5.966C5.273 5.753 5.242 5.557 5.227 5.379c-.048-.586 .09-.842 .198-.95 .119-.119 .423-.274 1.132-.178 .197 .027 .412 .072 .643 .135C6.504 4.825 5.872 5.358 5.322 5.966ZM19.612 16.803c.063 .229 .107 .441 .133 .637 .096 .708-.059 1.011-.178 1.13-.108 .108-.364 .246-.949 .198-.177-.015-.371-.045-.582-.094 .606-.548 1.137-1.178 1.576-1.872ZM15.881 17.826c-1.677-.878-3.624-2.324-5.506-4.206C8.495 11.741 7.051 9.796 6.172 8.12 7.064 6.785 8.401 5.773 9.969 5.299c.641-.194 1.323-.299 2.031-.299 3.866 0 7 3.134 7 7 0 .708-.105 1.391-.299 2.033-.474 1.567-1.485 2.903-2.819 3.794ZM13.605 18.815C13.09 18.936 12.553 19 12 19 8.134 19 5 15.866 5 12c0-.552 .064-1.089 .184-1.604 .965 1.517 2.25 3.112 3.777 4.639 1.528 1.528 3.126 2.815 4.644 3.78Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
        }
        return _planetLine!!
    }

private var _planetLine: ImageVector? = null
