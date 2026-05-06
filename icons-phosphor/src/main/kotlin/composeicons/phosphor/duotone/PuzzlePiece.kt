package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.PuzzlePiece: ImageVector
    get() {
        if (_puzzlePiece != null) return _puzzlePiece!!
        _puzzlePiece = phosphorDuotoneIcon(
            name = "PuzzlePiece",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M204 168c4.15 .004 8.249-.915 12-2.69v42.69c0 4.418-3.582 8-8 8h-144c-4.418 0-8-3.582-8-8v-42.69c-11.765 5.567-25.815 2.292-33.906-7.902-8.092-10.195-8.092-24.621 0-34.815C30.185 112.398 44.235 109.123 56 114.69v-42.69c0-4.418 3.582-8 8-8h46.69c-5.573-11.765-2.301-25.82 7.894-33.914 10.196-8.095 24.626-8.095 34.821 0 10.196 8.095 13.467 22.149 7.894 33.914h46.7c4.418 0 8 3.582 8 8v42.69c-10.386-4.914-22.719-2.984-31.108 4.866-8.389 7.851-11.13 20.029-6.914 30.717 4.216 10.688 14.533 17.716 26.022 17.726Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.2f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
            addPath(
                pathData = parseSvgPathData("M220.27 158.54c-2.318-1.462-5.224-1.636-7.7-.46-8.404 3.974-18.438 1.635-24.216-5.647-5.779-7.281-5.779-17.585 0-24.866 5.779-7.281 15.813-9.621 24.216-5.647 2.479 1.176 5.388 1 7.707-.466 2.319-1.467 3.724-4.02 3.723-6.764v-42.69c0-8.837-7.163-16-16-16h-36.22c.149-1.328 .222-2.664 .22-4-.017-9.94-4.126-19.434-11.36-26.25C150.521 16.247 135.839 13.408 122.907 18.455c-12.932 5.047-21.81 17.08-22.817 30.925-.154 2.206-.107 4.422 .14 6.62h-36.23C55.163 56 48 63.163 48 72v32.22c-1.328-.149-2.664-.222-4-.22-9.937 .016-19.428 4.125-26.24 11.36-6.863 7.249-10.377 17.041-9.69 27 1.185 17.933 15.388 32.259 33.31 33.6 2.206 .154 4.422 .107 6.62-.14v32.18c0 8.837 7.163 16 16 16h144c8.837 0 16-7.163 16-16v-42.69c.002-2.747-1.407-5.304-3.73-6.77ZM208 208h-144v-42.69c.001-2.744-1.404-5.297-3.723-6.764-2.319-1.467-5.228-1.643-7.707-.466-8.404 3.974-18.438 1.635-24.216-5.647-5.779-7.281-5.779-17.585 0-24.866 5.779-7.281 15.813-9.621 24.216-5.647 2.479 1.176 5.388 1 7.707-.466 2.319-1.467 3.724-4.02 3.723-6.764v-42.69h46.69c2.744 .001 5.297-1.404 6.764-3.723 1.467-2.319 1.643-5.228 .466-7.707-3.974-8.404-1.635-18.438 5.647-24.216 7.281-5.779 17.585-5.779 24.866 0 7.281 5.779 9.621 15.813 5.647 24.216-1.176 2.479-1 5.388 .466 7.707 1.467 2.319 4.02 3.724 6.764 3.723h46.69v32.23c-2.198-.252-4.414-.299-6.62-.14-19.354 1.37-34.14 17.832-33.433 37.221 .706 19.389 16.651 34.731 36.053 34.689 1.336 .002 2.672-.071 4-.22Z"),
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
        return _puzzlePiece!!
    }

private var _puzzlePiece: ImageVector? = null
