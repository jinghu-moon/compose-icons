package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.GithubLine: ImageVector
    get() {
        if (_githubLine != null) return _githubLine!!
        _githubLine = remixIcon(
            name = "GithubLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M5.884 18.653c-.3-.201-.558-.456-.86-.816-.109-.13-.551-.685-.466-.579-.463-.575-.755-.841-1.057-.949-.52-.186-.79-.759-.604-1.279 .186-.52 .759-.79 1.279-.604 .753 .27 1.262 .735 1.948 1.588-.094-.117 .339 .427 .433 .539 .191 .227 .33 .365 .439 .438 .205 .137 .588 .196 1.151 .14 .024-.382 .094-.753 .202-1.095C5.381 15.31 3.701 13.395 3.701 9.64c0-1.239 .369-2.356 1.058-3.292C4.542 5.454 4.574 4.373 5.061 3.156c.112-.279 .343-.493 .629-.583 .082-.024 .128-.034 .208-.047 .803-.123 1.937 .17 3.416 1.097 .867-.205 1.774-.308 2.687-.308 .912 0 1.818 .104 2.684 .308 1.476-.933 2.613-1.226 3.422-1.096 .085 .014 .157 .031 .218 .051 .281 .092 .507 .304 .617 .579 .486 1.216 .519 2.297 .302 3.191 .691 .936 1.058 2.045 1.058 3.293 0 3.757-1.674 5.665-4.642 6.392 .125 .415 .191 .878 .191 1.38 0 .664-.002 1.299-.007 2.01-.001 .19-.003 .393-.005 .706 .375 .083 .685 .38 .766 .781 .108 .542-.243 1.068-.785 1.177-1.139 .228-1.983-.532-1.983-1.524 0-.09 .001-.219 .002-.447 .002-.313 .004-.515 .005-.705 .005-.708 .007-1.338 .007-1.997 0-.697-.183-1.152-.426-1.361-.661-.57-.326-1.654 .541-1.751 2.966-.333 4.336-1.482 4.336-4.66 0-.955-.312-1.744-.913-2.404-.258-.283-.331-.689-.189-1.045 .166-.414 .236-.957 .095-1.614l-.009 .003c-.492 .139-1.11 .44-1.859 .949-.244 .166-.549 .216-.833 .136-.82-.231-1.702-.349-2.592-.349-.89 0-1.772 .118-2.592 .349-.283 .079-.586 .031-.829-.133C7.827 5.024 7.206 4.724 6.711 4.584c-.143 .653-.073 1.194 .093 1.607 .142 .356 .069 .761-.189 1.045-.597 .656-.913 1.458-.913 2.404 0 3.172 1.371 4.329 4.322 4.66 .865 .097 1.202 1.177 .545 1.748-.192 .167-.429 .732-.429 1.364v3.149c0 .986-.835 1.726-1.96 1.529-.544-.095-.908-.613-.813-1.157 .072-.412 .387-.721 .772-.805v-.99c-.91 .061-1.662-.088-2.254-.485Z"),
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
        return _githubLine!!
    }

private var _githubLine: ImageVector? = null
